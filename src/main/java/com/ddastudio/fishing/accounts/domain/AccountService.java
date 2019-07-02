package com.ddastudio.fishing.accounts.domain;

import com.ddastudio.fishing.common.util.SMSService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.Optional;

import static com.ddastudio.fishing.common.Constants.USE;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountService implements UserDetailsService {

    private final AccountRepository accountRepository;
    private final AccountDAO accountDAO;
    private final ModelMapper modelMapper;
    private final SMSService smsService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByPhoneNoAndAuditUseYn(username, USE).orElseThrow(() -> new UsernameNotFoundException(username));
        return new AccountAdapter(account);
    }

    //TODO : 객체 지향적으로 변경.
    private void existsAccount(AccountDTO accountDTO) throws Exception {
        if (accountRepository.findByPhoneNoAndAuditUseYn(accountDTO.getPhoneNo(), USE).isPresent())
            throw new Exception("이미 등록된 사용자 입니다. ");
    }

    Mono<AccountDTO> registerAccount(AccountDTO accountDTO) {
        log.info("==== Register Account ====");
        return Mono.fromCallable(() -> {
            this.existsAccount(accountDTO);
            Account account = modelMapper.map(accountDTO, Account.class);
//            String s = this.smsService.sendSMS(account.getPhoneNo());
            account.setSmsVerifyNo("123456");
            account.setAccountStatus("REQ");
            return modelMapper.map(accountRepository.save(account), AccountDTO.class);
        })
                .subscribeOn(Schedulers.elastic())
                .log();
    }

    //TODO : 객체 지향적으로 변경.
    Mono<AccountDTO> confirmAccount(AccountDTO accountDTO) {
        log.info("==== confirm Account ====");
        return Mono.fromCallable(() -> {
            Account account = this.accountRepository.findById(accountDTO.getId()).orElseThrow(() -> new UsernameNotFoundException(String.valueOf(accountDTO.getId())));
            if (!this.accountDAO.confirmMobileCertificationNo(accountDTO.getPhoneNo(), accountDTO.getSmsVerifyNo()))
                //TODO : Custom Exception  만들기
                throw new Exception("인증번호가 맞지 않습니다.");
            account.setAccountStatus("NML");
            return modelMapper.map(this.accountRepository.save(account), AccountDTO.class);
        })
                .subscribeOn(Schedulers.elastic())
                .log();


    }


}
