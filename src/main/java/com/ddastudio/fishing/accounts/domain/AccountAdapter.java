package com.ddastudio.fishing.accounts.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.parameters.P;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountAdapter extends User {

    private AccountDTO accountDTO;

    public AccountAdapter(AccountDTO accountDTO) {
        super(accountDTO.getPhoneNo(), accountDTO.getPw(), authorities(accountDTO.getRole()));
        this.accountDTO = accountDTO;
    }

    private static Collection<? extends GrantedAuthority> authorities(String role) {
        if(Objects.isNull(role))
            role = "ROLE_USER";
        return Set.of(new SimpleGrantedAuthority(role));
    }

    public AccountDTO getAccount() {
        return this.accountDTO;
    }
}
