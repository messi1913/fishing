package com.ddastudio.fishing.accounts.service;

import com.ddastudio.fishing.accounts.domain.AccountDAO;
import com.ddastudio.fishing.accounts.domain.AccountDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountValidator {

    private final AccountDAO accountDAO;

    public void validateRegistration(AccountDTO accountDTO, Errors errors) {

    }


}
