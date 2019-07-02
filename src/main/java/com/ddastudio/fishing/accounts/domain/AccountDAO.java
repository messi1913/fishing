package com.ddastudio.fishing.accounts.domain;

import com.ddastudio.fishing.jooq.tables.records.AccountRecord;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.ddastudio.fishing.common.Constants.USE;

@Repository
@RequiredArgsConstructor
public class AccountDAO {

    private final DSLContext query;

    private static com.ddastudio.fishing.jooq.tables.Account ACCOUNT = com.ddastudio.fishing.jooq.tables.Account.ACCOUNT;

    public Optional<AccountRecord> getAccountByPhoneNo(String phoneNo) {
        return query.select()
                .from(ACCOUNT)
                .where(ACCOUNT.PHONE_NO.equal(phoneNo)
                    .and(ACCOUNT.USE_YN.equal(USE)))
                .fetchOptionalInto(AccountRecord.class);
    }

    public boolean confirmMobileCertificationNo(String phoneNo, String key) {
        return query.fetchExists(query.select()
                .from(ACCOUNT)
                .where(ACCOUNT.PHONE_NO.equal(phoneNo))
                    .and(ACCOUNT.SMS_VERIFY_NO.equal(key))
                    .and(ACCOUNT.USE_YN.equal("Y")));
    }


}
