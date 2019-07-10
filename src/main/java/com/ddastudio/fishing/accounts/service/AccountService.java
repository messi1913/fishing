package com.ddastudio.fishing.accounts.service;

import com.ddastudio.fishing.accounts.domain.*;
import com.ddastudio.fishing.common.util.SMSService;
import com.ddastudio.fishing.jooq.tables.records.AccountRecord;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.Optional;

import static com.ddastudio.fishing.common.Constants.USE;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountService implements UserDetailsService {

    private final AccountDAO accountDAO;
    private final ModelMapper modelMapper;
    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;
    private final SMSService smsService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AccountDTO accountDTO = accountDAO.getAccountByPhoneNo(username).orElseThrow(() -> new UsernameNotFoundException(username));
        //Account account = accountRepository.findByPhoneNoAndAuditUseYn(username, USE).orElseThrow(() -> new UsernameNotFoundException(username));
        return new AccountAdapter(accountDTO);
    }

    public void existsAccount(AccountDTO accountDTO, Errors errors) {
        if(accountDAO.getAccountByPhoneNo(accountDTO).isPresent())
            errors.reject("Exist User", "해당 사용자 ["+accountDTO.getPhoneNo()+"] 는 이미 등록된 사용자 입니다.");
    }

    public AccountDTO registerAccount(AccountDTO accountDTO) {
        log.info("==== Register Account ====");
        Account account = modelMapper.map(accountDTO, Account.class);
        String sms = this.smsService.sendSMS(account.getPhoneNo());
        account.setSmsVerifyNo(sms);
        account.setAccountStatus("REQ");
        return modelMapper.map(accountRepository.save(account), AccountDTO.class);
    }

    public AccountDTO confirmAccount(AccountDTO accountDTO, Errors errors) {
        log.info("==== confirm Account ====");
        AccountDTO dtoFromDB = this.accountDAO.getAccountById(accountDTO.getId()).orElseThrow(() -> new UsernameNotFoundException(String.valueOf(accountDTO.getId())));

        dtoFromDB.validateSmsCode(accountDTO.getSmsVerifyNo(), errors);
        if(errors.hasErrors()) {
            return accountDTO;
        }
        String password = passwordEncoder.encode(accountDTO.getSmsVerifyNo());
        dtoFromDB.confirm(password);
        this.accountDAO.saveAccountStatus(dtoFromDB);
        return dtoFromDB;
    }


    public AccountDTO updateAccount(AccountDTO accountDTO, Errors errors) {
        Optional<Account> accountById = accountRepository.findById(accountDTO.getId());
        //Optional<AccountDTO> accountById = accountDAO.getAccountById(accountDTO.getId());
        if(accountById.isEmpty()) {
            errors.reject("Not exist user", "해당 사용자는 미가입 된 사용자 입니다.");
            return  accountDTO;
        }
        Account account = accountById.get();
        modelMapper.map(accountDTO, account);
        return modelMapper.map(accountRepository.save(account), AccountDTO.class);
    }

    public Optional<AccountDTO> retrievAccount(Integer id) {
        return accountDAO.getAccountById(id);
    }
}
