/*
 * This file is generated by jOOQ.
 */
package com.ddastudio.fishing.jooq.tables;


import com.ddastudio.fishing.jooq.FishingReservation;
import com.ddastudio.fishing.jooq.Indexes;
import com.ddastudio.fishing.jooq.Keys;
import com.ddastudio.fishing.jooq.tables.records.OauthClientDetailsRecord;

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
public class OauthClientDetails extends TableImpl<OauthClientDetailsRecord> {

    private static final long serialVersionUID = -1861815461;

    /**
     * The reference instance of <code>fishing_reservation.oauth_client_details</code>
     */
    public static final OauthClientDetails OAUTH_CLIENT_DETAILS = new OauthClientDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthClientDetailsRecord> getRecordType() {
        return OauthClientDetailsRecord.class;
    }

    /**
     * The column <code>fishing_reservation.oauth_client_details.client_id</code>.
     */
    public final TableField<OauthClientDetailsRecord, String> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>fishing_reservation.oauth_client_details.resource_ids</code>.
     */
    public final TableField<OauthClientDetailsRecord, String> RESOURCE_IDS = createField("resource_ids", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>fishing_reservation.oauth_client_details.client_secret</code>.
     */
    public final TableField<OauthClientDetailsRecord, String> CLIENT_SECRET = createField("client_secret", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>fishing_reservation.oauth_client_details.scope</code>.
     */
    public final TableField<OauthClientDetailsRecord, String> SCOPE = createField("scope", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>fishing_reservation.oauth_client_details.authorized_grant_types</code>.
     */
    public final TableField<OauthClientDetailsRecord, String> AUTHORIZED_GRANT_TYPES = createField("authorized_grant_types", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>fishing_reservation.oauth_client_details.web_server_redirect_uri</code>.
     */
    public final TableField<OauthClientDetailsRecord, String> WEB_SERVER_REDIRECT_URI = createField("web_server_redirect_uri", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>fishing_reservation.oauth_client_details.authorities</code>.
     */
    public final TableField<OauthClientDetailsRecord, String> AUTHORITIES = createField("authorities", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>fishing_reservation.oauth_client_details.access_token_validity</code>.
     */
    public final TableField<OauthClientDetailsRecord, Integer> ACCESS_TOKEN_VALIDITY = createField("access_token_validity", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>fishing_reservation.oauth_client_details.refresh_token_validity</code>.
     */
    public final TableField<OauthClientDetailsRecord, Integer> REFRESH_TOKEN_VALIDITY = createField("refresh_token_validity", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>fishing_reservation.oauth_client_details.additional_information</code>.
     */
    public final TableField<OauthClientDetailsRecord, String> ADDITIONAL_INFORMATION = createField("additional_information", org.jooq.impl.SQLDataType.VARCHAR(4096), this, "");

    /**
     * The column <code>fishing_reservation.oauth_client_details.autoapprove</code>.
     */
    public final TableField<OauthClientDetailsRecord, String> AUTOAPPROVE = createField("autoapprove", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>fishing_reservation.oauth_client_details</code> table reference
     */
    public OauthClientDetails() {
        this(DSL.name("oauth_client_details"), null);
    }

    /**
     * Create an aliased <code>fishing_reservation.oauth_client_details</code> table reference
     */
    public OauthClientDetails(String alias) {
        this(DSL.name(alias), OAUTH_CLIENT_DETAILS);
    }

    /**
     * Create an aliased <code>fishing_reservation.oauth_client_details</code> table reference
     */
    public OauthClientDetails(Name alias) {
        this(alias, OAUTH_CLIENT_DETAILS);
    }

    private OauthClientDetails(Name alias, Table<OauthClientDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OauthClientDetails(Name alias, Table<OauthClientDetailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OauthClientDetails(Table<O> child, ForeignKey<O, OauthClientDetailsRecord> key) {
        super(child, key, OAUTH_CLIENT_DETAILS);
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
        return Arrays.<Index>asList(Indexes.OAUTH_CLIENT_DETAILS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OauthClientDetailsRecord> getPrimaryKey() {
        return Keys.KEY_OAUTH_CLIENT_DETAILS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OauthClientDetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<OauthClientDetailsRecord>>asList(Keys.KEY_OAUTH_CLIENT_DETAILS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetails as(String alias) {
        return new OauthClientDetails(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientDetails as(Name alias) {
        return new OauthClientDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthClientDetails rename(String name) {
        return new OauthClientDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthClientDetails rename(Name name) {
        return new OauthClientDetails(name, null);
    }
}
