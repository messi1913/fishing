package com.ddastudio.fishing.accounts.domain;

import com.ddastudio.fishing.common.util.SMSService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("api/accounts")
public class AccountController {

    private final AccountService service;
    private final SMSService smsService;

    @PostMapping
    public Mono<AccountDTO> registerAccount(@RequestBody AccountDTO accountDTO) {
        log.info("===== Controller : register account =====");
        accountDTO.validateRegister();
        return this.service.registerAccount(accountDTO);
    }

    @PostMapping(value = "/sendSMS")
    public String sendSMS(@RequestBody String phoneNumber) {
        return smsService.sendSMS(phoneNumber);
    }

    @PatchMapping
    public Mono<AccountDTO> confirmAccount(@RequestBody AccountDTO accountDTO) {
        return this.service.confirmAccount(accountDTO);
    }



}
