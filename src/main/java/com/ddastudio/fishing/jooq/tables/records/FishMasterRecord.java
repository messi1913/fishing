/*
 * This file is generated by jOOQ.
 */
package com.ddastudio.fishing.jooq.tables.records;


import com.ddastudio.fishing.jooq.tables.FishMaster;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * 어종 관리
 *  - 현재 사용 안함
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FishMasterRecord extends TableRecordImpl<FishMasterRecord> implements Record4<Integer, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1360248786;

    /**
     * Setter for <code>fishing_reservation.fish_master.id</code>. 어종 아이디
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>fishing_reservation.fish_master.id</code>. 어종 아이디
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>fishing_reservation.fish_master.name</code>. 어종 이름
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>fishing_reservation.fish_master.name</code>. 어종 이름
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>fishing_reservation.fish_master.type</code>. 어종종류(S:바다, F:민물)
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>fishing_reservation.fish_master.type</code>. 어종종류(S:바다, F:민물)
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>fishing_reservation.fish_master.created</code>. 생성일자
     */
    public void setCreated(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>fishing_reservation.fish_master.created</code>. 생성일자
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FishMaster.FISH_MASTER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FishMaster.FISH_MASTER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FishMaster.FISH_MASTER.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return FishMaster.FISH_MASTER.CREATED;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
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
    public FishMasterRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FishMasterRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FishMasterRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FishMasterRecord value4(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FishMasterRecord values(Integer value1, String value2, String value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FishMasterRecord
     */
    public FishMasterRecord() {
        super(FishMaster.FISH_MASTER);
    }

    /**
     * Create a detached, initialised FishMasterRecord
     */
    public FishMasterRecord(Integer id, String name, String type, LocalDateTime created) {
        super(FishMaster.FISH_MASTER);

        set(0, id);
        set(1, name);
        set(2, type);
        set(3, created);
    }
}
