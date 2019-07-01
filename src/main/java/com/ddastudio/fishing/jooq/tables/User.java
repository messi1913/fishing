/*
 * This file is generated by jOOQ.
 */
package com.ddastudio.fishing.jooq.tables;


import com.ddastudio.fishing.jooq.FishingReservation;
import com.ddastudio.fishing.jooq.Indexes;
import com.ddastudio.fishing.jooq.Keys;
import com.ddastudio.fishing.jooq.tables.records.UserRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 사용자 관리
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = -500684366;

    /**
     * The reference instance of <code>fishing_reservation.user</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>fishing_reservation.user.id</code>. 사용자 아이디
     */
    public final TableField<UserRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "사용자 아이디");

    /**
     * The column <code>fishing_reservation.user.name</code>. 사용자 이름
     */
    public final TableField<UserRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "사용자 이름");

    /**
     * The column <code>fishing_reservation.user.avatar</code>.
     */
    public final TableField<UserRecord, String> AVATAR = createField("avatar", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>fishing_reservation.user.app_id</code>. 앱 아이디
     */
    public final TableField<UserRecord, Integer> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "앱 아이디");

    /**
     * The column <code>fishing_reservation.user.role</code>. customer: 일반사용자, manager: 관리자, admin: 운영자(개발자)
     */
    public final TableField<UserRecord, String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("customer", org.jooq.impl.SQLDataType.VARCHAR)), this, "customer: 일반사용자, manager: 관리자, admin: 운영자(개발자)");

    /**
     * The column <code>fishing_reservation.user.captain_yn</code>.
     */
    public final TableField<UserRecord, String> CAPTAIN_YN = createField("captain_yn", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>fishing_reservation.user.provider</code>.
     */
    public final TableField<UserRecord, String> PROVIDER = createField("provider", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * The column <code>fishing_reservation.user.provider_uid</code>.
     */
    public final TableField<UserRecord, String> PROVIDER_UID = createField("provider_uid", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * The column <code>fishing_reservation.user.use_yn</code>. 사용여부
     */
    public final TableField<UserRecord, String> USE_YN = createField("use_yn", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("Y", org.jooq.impl.SQLDataType.VARCHAR)), this, "사용여부");

    /**
     * The column <code>fishing_reservation.user.cancel_date</code>.
     */
    public final TableField<UserRecord, LocalDateTime> CANCEL_DATE = createField("cancel_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>fishing_reservation.user.email</code>.
     */
    public final TableField<UserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>fishing_reservation.user.pw</code>.
     */
    public final TableField<UserRecord, String> PW = createField("pw", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>fishing_reservation.user.refresh_token</code>.
     */
    public final TableField<UserRecord, String> REFRESH_TOKEN = createField("refresh_token", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>fishing_reservation.user.email_check</code>.
     */
    public final TableField<UserRecord, LocalDateTime> EMAIL_CHECK = createField("email_check", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>fishing_reservation.user.updated</code>.
     */
    public final TableField<UserRecord, LocalDateTime> UPDATED = createField("updated", org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>fishing_reservation.user.created</code>.
     */
    public final TableField<UserRecord, LocalDateTime> CREATED = createField("created", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * Create a <code>fishing_reservation.user</code> table reference
     */
    public User() {
        this(DSL.name("user"), null);
    }

    /**
     * Create an aliased <code>fishing_reservation.user</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>fishing_reservation.user</code> table reference
     */
    public User(Name alias) {
        this(alias, USER);
    }

    private User(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("사용자 관리"));
    }

    public <O extends Record> User(Table<O> child, ForeignKey<O, UserRecord> key) {
        super(child, key, USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return FishingReservation.FISHING_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_PRIMARY, Indexes.USER_PROVIDER_PROVIDER_UID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }
}