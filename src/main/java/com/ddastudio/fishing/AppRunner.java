package com.ddastudio.fishing;

import com.ddastudio.fishing.accounts.domain.Account;
import com.ddastudio.fishing.accounts.domain.AccountRepository;
import com.ddastudio.fishing.common.AppProperties;
import com.ddastudio.fishing.common.domain.AppMaster;
import com.ddastudio.fishing.common.domain.AppMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AppRunner implements ApplicationRunner {

    @Autowired
    AppMasterRepository repository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AppProperties pw;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.err.println(pw.getOauthPassword());
        System.err.println(pw.getOauthPublicKey());

    }
}
