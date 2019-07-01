/*
 * This file is generated by jOOQ.
 */
package com.ddastudio.fishing.jooq.tables;


import com.ddastudio.fishing.jooq.FishingReservation;
import com.ddastudio.fishing.jooq.Indexes;
import com.ddastudio.fishing.jooq.Keys;
import com.ddastudio.fishing.jooq.tables.records.UsedRefreshTokenRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class UsedRefreshToken extends TableImpl<UsedRefreshTokenRecord> {

    private static final long serialVersionUID = -392271151;

    /**
     * The reference instance of <code>fishing_reservation.used_refresh_token</code>
     */
    public static final UsedRefreshToken USED_REFRESH_TOKEN = new UsedRefreshToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsedRefreshTokenRecord> getRecordType() {
        return UsedRefreshTokenRecord.class;
    }

    /**
     * The column <code>fishing_reservation.used_refresh_token.token</code>.
     */
    public final TableField<UsedRefreshTokenRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>fishing_reservation.used_refresh_token.created</code>.
     */
    public final TableField<UsedRefreshTokenRecord, LocalDateTime> CREATED = createField("created", org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>fishing_reservation.used_refresh_token.client_id</code>.
     */
    public final TableField<UsedRefreshTokenRecord, String> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>fishing_reservation.used_refresh_token</code> table reference
     */
    public UsedRefreshToken() {
        this(DSL.name("used_refresh_token"), null);
    }

    /**
     * Create an aliased <code>fishing_reservation.used_refresh_token</code> table reference
     */
    public UsedRefreshToken(String alias) {
        this(DSL.name(alias), USED_REFRESH_TOKEN);
    }

    /**
     * Create an aliased <code>fishing_reservation.used_refresh_token</code> table reference
     */
    public UsedRefreshToken(Name alias) {
        this(alias, USED_REFRESH_TOKEN);
    }

    private UsedRefreshToken(Name alias, Table<UsedRefreshTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private UsedRefreshToken(Name alias, Table<UsedRefreshTokenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UsedRefreshToken(Table<O> child, ForeignKey<O, UsedRefreshTokenRecord> key) {
        super(child, key, USED_REFRESH_TOKEN);
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
        return Arrays.<Index>asList(Indexes.USED_REFRESH_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UsedRefreshTokenRecord> getPrimaryKey() {
        return Keys.KEY_USED_REFRESH_TOKEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsedRefreshTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<UsedRefreshTokenRecord>>asList(Keys.KEY_USED_REFRESH_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsedRefreshToken as(String alias) {
        return new UsedRefreshToken(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsedRefreshToken as(Name alias) {
        return new UsedRefreshToken(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UsedRefreshToken rename(String name) {
        return new UsedRefreshToken(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UsedRefreshToken rename(Name name) {
        return new UsedRefreshToken(name, null);
    }
}
