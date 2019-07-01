/*
 * This file is generated by jOOQ.
 */
package com.ddastudio.fishing.jooq.tables;


import com.ddastudio.fishing.jooq.FishingReservation;
import com.ddastudio.fishing.jooq.Indexes;
import com.ddastudio.fishing.jooq.Keys;
import com.ddastudio.fishing.jooq.tables.records.ReservationRecord;

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
 * 예약 관리
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Reservation extends TableImpl<ReservationRecord> {

    private static final long serialVersionUID = 437524296;

    /**
     * The reference instance of <code>fishing_reservation.reservation</code>
     */
    public static final Reservation RESERVATION = new Reservation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationRecord> getRecordType() {
        return ReservationRecord.class;
    }

    /**
     * The column <code>fishing_reservation.reservation.id</code>.
     */
    public final TableField<ReservationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>fishing_reservation.reservation.app_id</code>.
     */
    public final TableField<ReservationRecord, Integer> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>fishing_reservation.reservation.schedule_id</code>.
     */
    public final TableField<ReservationRecord, Integer> SCHEDULE_ID = createField("schedule_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>fishing_reservation.reservation.user_id</code>.
     */
    public final TableField<ReservationRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>fishing_reservation.reservation.type</code>. 예약타입(1: 개인, 2: 단체, 3: 대여)
단체(2) - 사용자 1명이 여러사람을 예약
대여(3) - 사용자 2명이 배를 대여함, 추가 예약 불가
     */
    public final TableField<ReservationRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "예약타입(1: 개인, 2: 단체, 3: 대여)\n단체(2) - 사용자 1명이 여러사람을 예약\n대여(3) - 사용자 2명이 배를 대여함, 추가 예약 불가");

    /**
     * The column <code>fishing_reservation.reservation.person_count</code>.
     */
    public final TableField<ReservationRecord, Integer> PERSON_COUNT = createField("person_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>fishing_reservation.reservation.price</code>. type, person_count 에 따라 계산된 금액
     */
    public final TableField<ReservationRecord, Integer> PRICE = createField("price", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "type, person_count 에 따라 계산된 금액");

    /**
     * The column <code>fishing_reservation.reservation.status</code>. (STATUS)
     */
    public final TableField<ReservationRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(2), this, "(STATUS)");

    /**
     * The column <code>fishing_reservation.reservation.deposit_status</code>. (DEPOSIT_STATUS)
     */
    public final TableField<ReservationRecord, String> DEPOSIT_STATUS = createField("deposit_status", org.jooq.impl.SQLDataType.VARCHAR(2).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)), this, "(DEPOSIT_STATUS)");

    /**
     * The column <code>fishing_reservation.reservation.depositor</code>.
     */
    public final TableField<ReservationRecord, String> DEPOSITOR = createField("depositor", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>fishing_reservation.reservation.request_remarks</code>.
     */
    public final TableField<ReservationRecord, String> REQUEST_REMARKS = createField("request_remarks", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>fishing_reservation.reservation.remarks</code>.
     */
    public final TableField<ReservationRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>fishing_reservation.reservation.use_yn</code>.
     */
    public final TableField<ReservationRecord, String> USE_YN = createField("use_yn", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("Y", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>fishing_reservation.reservation.cancel_code</code>. 0: 사용자취소, 1:관리자취소, 2:미입금
     */
    public final TableField<ReservationRecord, String> CANCEL_CODE = createField("cancel_code", org.jooq.impl.SQLDataType.VARCHAR(10), this, "0: 사용자취소, 1:관리자취소, 2:미입금");

    /**
     * The column <code>fishing_reservation.reservation.cancel_reason</code>.
     */
    public final TableField<ReservationRecord, String> CANCEL_REASON = createField("cancel_reason", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>fishing_reservation.reservation.cancel_date</code>.
     */
    public final TableField<ReservationRecord, LocalDateTime> CANCEL_DATE = createField("cancel_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>fishing_reservation.reservation.updated</code>.
     */
    public final TableField<ReservationRecord, LocalDateTime> UPDATED = createField("updated", org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>fishing_reservation.reservation.created</code>.
     */
    public final TableField<ReservationRecord, LocalDateTime> CREATED = createField("created", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * Create a <code>fishing_reservation.reservation</code> table reference
     */
    public Reservation() {
        this(DSL.name("reservation"), null);
    }

    /**
     * Create an aliased <code>fishing_reservation.reservation</code> table reference
     */
    public Reservation(String alias) {
        this(DSL.name(alias), RESERVATION);
    }

    /**
     * Create an aliased <code>fishing_reservation.reservation</code> table reference
     */
    public Reservation(Name alias) {
        this(alias, RESERVATION);
    }

    private Reservation(Name alias, Table<ReservationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Reservation(Name alias, Table<ReservationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("예약 관리"));
    }

    public <O extends Record> Reservation(Table<O> child, ForeignKey<O, ReservationRecord> key) {
        super(child, key, RESERVATION);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationRecord> getPrimaryKey() {
        return Keys.KEY_RESERVATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationRecord>>asList(Keys.KEY_RESERVATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reservation as(String alias) {
        return new Reservation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reservation as(Name alias) {
        return new Reservation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Reservation rename(String name) {
        return new Reservation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Reservation rename(Name name) {
        return new Reservation(name, null);
    }
}