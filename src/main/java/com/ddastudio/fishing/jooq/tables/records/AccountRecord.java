/*
 * This file is generated by jOOQ.
 */
package com.ddastudio.fishing.jooq.tables.records;


import com.ddastudio.fishing.jooq.tables.Account;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> implements Record19<Integer, String, Integer, LocalDateTime, LocalDateTime, String, String, LocalDate, String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -229682201;

    /**
     * Setter for <code>fishing_reservation.account.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>fishing_reservation.account.account_status</code>.
     */
    public void setAccountStatus(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.account_status</code>.
     */
    public String getAccountStatus() {
        return (String) get(1);
    }

    /**
     * Setter for <code>fishing_reservation.account.app_id</code>.
     */
    public void setAppId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.app_id</code>.
     */
    public Integer getAppId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>fishing_reservation.account.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>fishing_reservation.account.updated</code>.
     */
    public void setUpdated(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.updated</code>.
     */
    public LocalDateTime getUpdated() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>fishing_reservation.account.use_yn</code>.
     */
    public void setUseYn(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.use_yn</code>.
     */
    public String getUseYn() {
        return (String) get(5);
    }

    /**
     * Setter for <code>fishing_reservation.account.avatar</code>.
     */
    public void setAvatar(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.avatar</code>.
     */
    public String getAvatar() {
        return (String) get(6);
    }

    /**
     * Setter for <code>fishing_reservation.account.cancel_date</code>.
     */
    public void setCancelDate(LocalDate value) {
        set(7, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.cancel_date</code>.
     */
    public LocalDate getCancelDate() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>fishing_reservation.account.captain_yn</code>.
     */
    public void setCaptainYn(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.captain_yn</code>.
     */
    public String getCaptainYn() {
        return (String) get(8);
    }

    /**
     * Setter for <code>fishing_reservation.account.email</code>.
     */
    public void setEmail(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.email</code>.
     */
    public String getEmail() {
        return (String) get(9);
    }

    /**
     * Setter for <code>fishing_reservation.account.email_check</code>.
     */
    public void setEmailCheck(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.email_check</code>.
     */
    public String getEmailCheck() {
        return (String) get(10);
    }

    /**
     * Setter for <code>fishing_reservation.account.name</code>.
     */
    public void setName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.name</code>.
     */
    public String getName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>fishing_reservation.account.phone_no</code>.
     */
    public void setPhoneNo(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.phone_no</code>.
     */
    public String getPhoneNo() {
        return (String) get(12);
    }

    /**
     * Setter for <code>fishing_reservation.account.provider</code>.
     */
    public void setProvider(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.provider</code>.
     */
    public String getProvider() {
        return (String) get(13);
    }

    /**
     * Setter for <code>fishing_reservation.account.provider_uid</code>.
     */
    public void setProviderUid(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.provider_uid</code>.
     */
    public String getProviderUid() {
        return (String) get(14);
    }

    /**
     * Setter for <code>fishing_reservation.account.pw</code>.
     */
    public void setPw(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.pw</code>.
     */
    public String getPw() {
        return (String) get(15);
    }

    /**
     * Setter for <code>fishing_reservation.account.refresh_token</code>.
     */
    public void setRefreshToken(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.refresh_token</code>.
     */
    public String getRefreshToken() {
        return (String) get(16);
    }

    /**
     * Setter for <code>fishing_reservation.account.role</code>.
     */
    public void setRole(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.role</code>.
     */
    public String getRole() {
        return (String) get(17);
    }

    /**
     * Setter for <code>fishing_reservation.account.sms_verify_no</code>.
     */
    public void setSmsVerifyNo(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>fishing_reservation.account.sms_verify_no</code>.
     */
    public String getSmsVerifyNo() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, String, Integer, LocalDateTime, LocalDateTime, String, String, LocalDate, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, String, Integer, LocalDateTime, LocalDateTime, String, String, LocalDate, String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Account.ACCOUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Account.ACCOUNT.ACCOUNT_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Account.ACCOUNT.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return Account.ACCOUNT.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return Account.ACCOUNT.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Account.ACCOUNT.USE_YN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Account.ACCOUNT.AVATAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field8() {
        return Account.ACCOUNT.CANCEL_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Account.ACCOUNT.CAPTAIN_YN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Account.ACCOUNT.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Account.ACCOUNT.EMAIL_CHECK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Account.ACCOUNT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Account.ACCOUNT.PHONE_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Account.ACCOUNT.PROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Account.ACCOUNT.PROVIDER_UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Account.ACCOUNT.PW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Account.ACCOUNT.REFRESH_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Account.ACCOUNT.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return Account.ACCOUNT.SMS_VERIFY_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAccountStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component4() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component5() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUseYn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate component8() {
        return getCancelDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCaptainYn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getEmailCheck();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getPhoneNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getProviderUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getPw();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getRefreshToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getSmsVerifyNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAccountStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUseYn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value8() {
        return getCancelDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCaptainYn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getEmailCheck();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getPhoneNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getProviderUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getPw();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getRefreshToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getSmsVerifyNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value2(String value) {
        setAccountStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value3(Integer value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value4(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value5(LocalDateTime value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value6(String value) {
        setUseYn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value7(String value) {
        setAvatar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value8(LocalDate value) {
        setCancelDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value9(String value) {
        setCaptainYn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value10(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value11(String value) {
        setEmailCheck(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value12(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value13(String value) {
        setPhoneNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value14(String value) {
        setProvider(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value15(String value) {
        setProviderUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value16(String value) {
        setPw(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value17(String value) {
        setRefreshToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value18(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value19(String value) {
        setSmsVerifyNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord values(Integer value1, String value2, Integer value3, LocalDateTime value4, LocalDateTime value5, String value6, String value7, LocalDate value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, String value18, String value19) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountRecord
     */
    public AccountRecord() {
        super(Account.ACCOUNT);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(Integer id, String accountStatus, Integer appId, LocalDateTime created, LocalDateTime updated, String useYn, String avatar, LocalDate cancelDate, String captainYn, String email, String emailCheck, String name, String phoneNo, String provider, String providerUid, String pw, String refreshToken, String role, String smsVerifyNo) {
        super(Account.ACCOUNT);

        set(0, id);
        set(1, accountStatus);
        set(2, appId);
        set(3, created);
        set(4, updated);
        set(5, useYn);
        set(6, avatar);
        set(7, cancelDate);
        set(8, captainYn);
        set(9, email);
        set(10, emailCheck);
        set(11, name);
        set(12, phoneNo);
        set(13, provider);
        set(14, providerUid);
        set(15, pw);
        set(16, refreshToken);
        set(17, role);
        set(18, smsVerifyNo);
    }
}
