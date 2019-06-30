package com.ddastudio.fishing.accounts.domain;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AccountDAO {

    private final DSLContext dsl;

    private com.ddastudio.fishing.jooq.tables.Account ACCOUNT = com.ddastudio.fishing.jooq.tables.Account.ACCOUNT;

}
