package com.ddastudio.fishing.accounts.domain;

import com.ddastudio.fishing.jooq.tables.records.AccountRecord;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static com.ddastudio.fishing.common.Constants.USE;

@Repository
@RequiredArgsConstructor
public class AccountDAO {

    private final DSLContext query;

    private static com.ddastudio.fishing.jooq.tables.Account ACCOUNT = com.ddastudio.fishing.jooq.tables.Account.ACCOUNT;

    public Optional<AccountDTO> getAccountByPhoneNo(String phoneNo) {
        return this.getAccountByPhoneNo(AccountDTO.builder().phoneNo(phoneNo).build());
    }

    public Optional<AccountDTO> getAccountByPhoneNo(AccountDTO accountDTO) {
        return query.select()
                .from(ACCOUNT)
                .where(ACCOUNT.PHONE_NO.equal(accountDTO.getPhoneNo())
                    //.and(ACCOUNT.APP_ID.equal(accountDTO.getAppId()))
                    .and(ACCOUNT.USE_YN.equal(USE)))
                .fetchOptionalInto(AccountDTO.class);
    }

    public Optional<AccountDTO> getAccountById(Integer id) {
        return query.select()
                .from(ACCOUNT)
                .where(ACCOUNT.ID.eq(id))
                    .and(ACCOUNT.USE_YN.equal(USE))
                .fetchOptionalInto(AccountDTO.class);
    }


    public int saveAccountStatus(AccountDTO accountDTO) {
        return query.update(ACCOUNT)
                .set(ACCOUNT.ACCOUNT_STATUS, accountDTO.getAccountStatus())
                .set(ACCOUNT.PW, accountDTO.getPw())
                .set(ACCOUNT.UPDATED, LocalDateTime.now())
                .where(ACCOUNT.ID.equal(accountDTO.getId()))
                    .and(ACCOUNT.USE_YN.equal(USE))
             .execute();
    }

    public boolean confirmMobileCertificationNo(String phoneNo, String key) {
        return query.fetchExists(query.select()
                .from(ACCOUNT)
                .where(ACCOUNT.PHONE_NO.equal(phoneNo))
                    .and(ACCOUNT.SMS_VERIFY_NO.equal(key))
                    .and(ACCOUNT.USE_YN.equal("Y")));
    }


}
