/*
 * This file is generated by jOOQ.
 */
package com.ddastudio.fishing.jooq.tables.records;


import com.ddastudio.fishing.jooq.tables.BoatMaster;
import com.google.gson.JsonElement;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 배 마스터 테이블
 *  - 하나의 선단은 보통 배를 1~5개 가짐 ( 배 추가 등록시마다 비용을 받아야됨 ) 
 *  - 등록된 배가 없으면 앱 이용이 불가 ( 클라이언트 프로그램 )
 *  - 관리자용 프로그램에서 등록 가능
 *  - type, captain_id, capacity, fish_type, from_time, to_time의 값들은 일정(schedule) 
 * 등록시 기본팅값으로 사용
 *    ( schedule 테이블에도 똑같은 컬럼이 존재 )
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BoatMasterRecord extends UpdatableRecordImpl<BoatMasterRecord> implements Record18<Integer, Integer, String, Integer, Integer, Integer, JsonElement, String, String, Integer, String, JsonElement, String, JsonElement, String, LocalDateTime, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1033460543;

    /**
     * Setter for <code>fishing_reservation.boat_master.app_id</code>. 앱 아이디
     */
    public void setAppId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.app_id</code>. 앱 아이디
     */
    public Integer getAppId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.id</code>. 배 아이디
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.id</code>. 배 아이디
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.name</code>. 배 이름
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.name</code>. 배 이름
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.type</code>. 선박종류
 - code_master(BOAT_TYPE)
 - 0:일반낚시, 1:종일낚시, 2:시간낚시
 - 현재는 사용안함
     */
    public void setType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.type</code>. 선박종류
 - code_master(BOAT_TYPE)
 - 0:일반낚시, 1:종일낚시, 2:시간낚시
 - 현재는 사용안함
     */
    public Integer getType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.captain_id</code>. 선장 아이디
 - 일정 등록시 schedule.captain_id의 기본값으로 사용
 - user.captain_yn 값이 Y인 사용자만 등록 가능
     */
    public void setCaptainId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.captain_id</code>. 선장 아이디
 - 일정 등록시 schedule.captain_id의 기본값으로 사용
 - user.captain_yn 값이 Y인 사용자만 등록 가능
     */
    public Integer getCaptainId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.capacity</code>. 승선 가능 인원
 - 일정 등록시 schedule.capacity의 기본값으로 사용
     */
    public void setCapacity(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.capacity</code>. 승선 가능 인원
 - 일정 등록시 schedule.capacity의 기본값으로 사용
     */
    public Integer getCapacity() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.fish_type</code>. 어종
 - ["다운샷", "갈치"]
 - schedule.fish_type의 기본값으로 사용됨
     */
    public void setFishType(JsonElement value) {
        set(6, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.fish_type</code>. 어종
 - ["다운샷", "갈치"]
 - schedule.fish_type의 기본값으로 사용됨
     */
    public JsonElement getFishType() {
        return (JsonElement) get(6);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.from_time</code>. 출항시간
 - 일정 등록시 schedule.from_time의 기본값으로 사용
     */
    public void setFromTime(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.from_time</code>. 출항시간
 - 일정 등록시 schedule.from_time의 기본값으로 사용
     */
    public String getFromTime() {
        return (String) get(7);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.to_time</code>. 도착시간
 - 일정 등록시 schedule.to_time의 기본값으로 사용
     */
    public void setToTime(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.to_time</code>. 도착시간
 - 일정 등록시 schedule.to_time의 기본값으로 사용
     */
    public String getToTime() {
        return (String) get(8);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.price</code>. 예약금액
     */
    public void setPrice(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.price</code>. 예약금액
     */
    public Integer getPrice() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.info</code>. 선박정보
     */
    public void setInfo(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.info</code>. 선박정보
     */
    public String getInfo() {
        return (String) get(10);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.location</code>. 배 위치정보
 - {"lat": 36.158112, "lng": 126.500087, "title": "장고항", "address": "충청남도 ...", "snippet": ""}
 - 배 상세정보에서 사용함
     */
    public void setLocation(JsonElement value) {
        set(11, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.location</code>. 배 위치정보
 - {"lat": 36.158112, "lng": 126.500087, "title": "장고항", "address": "충청남도 ...", "snippet": ""}
 - 배 상세정보에서 사용함
     */
    public JsonElement getLocation() {
        return (JsonElement) get(11);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.avatar</code>. 배 대표 이미지
     */
    public void setAvatar(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.avatar</code>. 배 대표 이미지
     */
    public String getAvatar() {
        return (String) get(12);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.images</code>. 배 상세 이미지
 - 배 상세 화면에서 사용함
     */
    public void setImages(JsonElement value) {
        set(13, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.images</code>. 배 상세 이미지
 - 배 상세 화면에서 사용함
     */
    public JsonElement getImages() {
        return (JsonElement) get(13);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.use_yn</code>. 사용여부
 - 값을 N으로 변경시 cancle_date 에 변경일시 값을 입력해야함
     */
    public void setUseYn(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.use_yn</code>. 사용여부
 - 값을 N으로 변경시 cancle_date 에 변경일시 값을 입력해야함
     */
    public String getUseYn() {
        return (String) get(14);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.cancel_date</code>. 사용종료 일시
 - use_yn값이 N으로 변경될 때 값이 들어온다.
     */
    public void setCancelDate(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.cancel_date</code>. 사용종료 일시
 - use_yn값이 N으로 변경될 때 값이 들어온다.
     */
    public LocalDateTime getCancelDate() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.updated</code>. 수정일시
     */
    public void setUpdated(LocalDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.updated</code>. 수정일시
     */
    public LocalDateTime getUpdated() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>fishing_reservation.boat_master.created</code>. 생성일시
     */
    public void setCreated(LocalDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>fishing_reservation.boat_master.created</code>. 생성일시
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Integer, String, Integer, Integer, Integer, JsonElement, String, String, Integer, String, JsonElement, String, JsonElement, String, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Integer, String, Integer, Integer, Integer, JsonElement, String, String, Integer, String, JsonElement, String, JsonElement, String, LocalDateTime, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BoatMaster.BOAT_MASTER.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return BoatMaster.BOAT_MASTER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BoatMaster.BOAT_MASTER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return BoatMaster.BOAT_MASTER.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return BoatMaster.BOAT_MASTER.CAPTAIN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return BoatMaster.BOAT_MASTER.CAPACITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonElement> field7() {
        return BoatMaster.BOAT_MASTER.FISH_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return BoatMaster.BOAT_MASTER.FROM_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return BoatMaster.BOAT_MASTER.TO_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return BoatMaster.BOAT_MASTER.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return BoatMaster.BOAT_MASTER.INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonElement> field12() {
        return BoatMaster.BOAT_MASTER.LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return BoatMaster.BOAT_MASTER.AVATAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JsonElement> field14() {
        return BoatMaster.BOAT_MASTER.IMAGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return BoatMaster.BOAT_MASTER.USE_YN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field16() {
        return BoatMaster.BOAT_MASTER.CANCEL_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field17() {
        return BoatMaster.BOAT_MASTER.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field18() {
        return BoatMaster.BOAT_MASTER.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCaptainId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonElement component7() {
        return getFishType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getFromTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getToTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonElement component12() {
        return getLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonElement component14() {
        return getImages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getUseYn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component16() {
        return getCancelDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component17() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component18() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCaptainId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonElement value7() {
        return getFishType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getFromTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getToTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonElement value12() {
        return getLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonElement value14() {
        return getImages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getUseYn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value16() {
        return getCancelDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value17() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value18() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value1(Integer value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value4(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value5(Integer value) {
        setCaptainId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value6(Integer value) {
        setCapacity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value7(JsonElement value) {
        setFishType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value8(String value) {
        setFromTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value9(String value) {
        setToTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value10(Integer value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value11(String value) {
        setInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value12(JsonElement value) {
        setLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value13(String value) {
        setAvatar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value14(JsonElement value) {
        setImages(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value15(String value) {
        setUseYn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value16(LocalDateTime value) {
        setCancelDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value17(LocalDateTime value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord value18(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BoatMasterRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, Integer value6, JsonElement value7, String value8, String value9, Integer value10, String value11, JsonElement value12, String value13, JsonElement value14, String value15, LocalDateTime value16, LocalDateTime value17, LocalDateTime value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BoatMasterRecord
     */
    public BoatMasterRecord() {
        super(BoatMaster.BOAT_MASTER);
    }

    /**
     * Create a detached, initialised BoatMasterRecord
     */
    public BoatMasterRecord(Integer appId, Integer id, String name, Integer type, Integer captainId, Integer capacity, JsonElement fishType, String fromTime, String toTime, Integer price, String info, JsonElement location, String avatar, JsonElement images, String useYn, LocalDateTime cancelDate, LocalDateTime updated, LocalDateTime created) {
        super(BoatMaster.BOAT_MASTER);

        set(0, appId);
        set(1, id);
        set(2, name);
        set(3, type);
        set(4, captainId);
        set(5, capacity);
        set(6, fishType);
        set(7, fromTime);
        set(8, toTime);
        set(9, price);
        set(10, info);
        set(11, location);
        set(12, avatar);
        set(13, images);
        set(14, useYn);
        set(15, cancelDate);
        set(16, updated);
        set(17, created);
    }
}
