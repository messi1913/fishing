/*
 * This file is generated by jOOQ.
 */
package com.ddastudio.fishing.jooq.tables;


import com.ddastudio.fishing.jooq.FishingReservation;
import com.ddastudio.fishing.jooq.tables.records.BankMasterRecord;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class BankMaster extends TableImpl<BankMasterRecord> {

    private static final long serialVersionUID = -942938959;

    /**
     * The reference instance of <code>fishing_reservation.bank_master</code>
     */
    public static final BankMaster BANK_MASTER = new BankMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankMasterRecord> getRecordType() {
        return BankMasterRecord.class;
    }

    /**
     * The column <code>fishing_reservation.bank_master.id</code>.
     */
    public final TableField<BankMasterRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>fishing_reservation.bank_master.app_id</code>.
     */
    public final TableField<BankMasterRecord, Integer> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>fishing_reservation.bank_master.bank_name</code>.
     */
    public final TableField<BankMasterRecord, String> BANK_NAME = createField("bank_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>fishing_reservation.bank_master.account_no</code>.
     */
    public final TableField<BankMasterRecord, String> ACCOUNT_NO = createField("account_no", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>fishing_reservation.bank_master.user_name</code>.
     */
    public final TableField<BankMasterRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>fishing_reservation.bank_master.use_yn</code>.
     */
    public final TableField<BankMasterRecord, String> USE_YN = createField("use_yn", org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("Y", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>fishing_reservation.bank_master.updated</code>.
     */
    public final TableField<BankMasterRecord, LocalDateTime> UPDATED = createField("updated", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>fishing_reservation.bank_master.created</code>.
     */
    public final TableField<BankMasterRecord, LocalDateTime> CREATED = createField("created", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>fishing_reservation.bank_master</code> table reference
     */
    public BankMaster() {
        this(DSL.name("bank_master"), null);
    }

    /**
     * Create an aliased <code>fishing_reservation.bank_master</code> table reference
     */
    public BankMaster(String alias) {
        this(DSL.name(alias), BANK_MASTER);
    }

    /**
     * Create an aliased <code>fishing_reservation.bank_master</code> table reference
     */
    public BankMaster(Name alias) {
        this(alias, BANK_MASTER);
    }

    private BankMaster(Name alias, Table<BankMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private BankMaster(Name alias, Table<BankMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BankMaster(Table<O> child, ForeignKey<O, BankMasterRecord> key) {
        super(child, key, BANK_MASTER);
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
    public BankMaster as(String alias) {
        return new BankMaster(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BankMaster as(Name alias) {
        return new BankMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BankMaster rename(String name) {
        return new BankMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BankMaster rename(Name name) {
        return new BankMaster(name, null);
    }
}
