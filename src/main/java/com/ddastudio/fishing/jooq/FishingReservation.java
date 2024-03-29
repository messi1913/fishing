/*
 * This file is generated by jOOQ.
 */
package com.ddastudio.fishing.jooq;


import com.ddastudio.fishing.jooq.tables.Account;
import com.ddastudio.fishing.jooq.tables.AppMaster;
import com.ddastudio.fishing.jooq.tables.BankMaster;
import com.ddastudio.fishing.jooq.tables.BoatMaster;
import com.ddastudio.fishing.jooq.tables.CodeMaster;
import com.ddastudio.fishing.jooq.tables.CommunityComment;
import com.ddastudio.fishing.jooq.tables.CommunityContent;
import com.ddastudio.fishing.jooq.tables.FishMaster;
import com.ddastudio.fishing.jooq.tables.MyNews;
import com.ddastudio.fishing.jooq.tables.OauthClientDetails;
import com.ddastudio.fishing.jooq.tables.Reservation;
import com.ddastudio.fishing.jooq.tables.ReservationHistory;
import com.ddastudio.fishing.jooq.tables.ReservationWaiting;
import com.ddastudio.fishing.jooq.tables.Schedule;
import com.ddastudio.fishing.jooq.tables.TestMaster;
import com.ddastudio.fishing.jooq.tables.UsedRefreshToken;
import com.ddastudio.fishing.jooq.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class FishingReservation extends SchemaImpl {

    private static final long serialVersionUID = 1291635848;

    /**
     * The reference instance of <code>fishing_reservation</code>
     */
    public static final FishingReservation FISHING_RESERVATION = new FishingReservation();

    /**
     * The table <code>fishing_reservation.account</code>.
     */
    public final Account ACCOUNT = com.ddastudio.fishing.jooq.tables.Account.ACCOUNT;

    /**
     * 앱 마스터 테이블
 - 여러개의 앱에서 하나의 데이터베이스를 공유하기 때문에 각각의 앱을 구분하기 위한 테이블 
 - 선단별로 앱을 각각 가짐

     */
    public final AppMaster APP_MASTER = com.ddastudio.fishing.jooq.tables.AppMaster.APP_MASTER;

    /**
     * The table <code>fishing_reservation.bank_master</code>.
     */
    public final BankMaster BANK_MASTER = com.ddastudio.fishing.jooq.tables.BankMaster.BANK_MASTER;

    /**
     * 배 마스터 테이블
 - 하나의 선단은 보통 배를 1~5개 가짐 ( 배 추가 등록시마다 비용을 받아야됨 ) 
 - 등록된 배가 없으면 앱 이용이 불가 ( 클라이언트 프로그램 )
 - 관리자용 프로그램에서 등록 가능
 - type, captain_id, capacity, fish_type, from_time, to_time의 값들은 일정(schedule) 등록시 기본팅값으로 사용
   ( schedule 테이블에도 똑같은 컬럼이 존재 )
     */
    public final BoatMaster BOAT_MASTER = com.ddastudio.fishing.jooq.tables.BoatMaster.BOAT_MASTER;

    /**
     * The table <code>fishing_reservation.code_master</code>.
     */
    public final CodeMaster CODE_MASTER = com.ddastudio.fishing.jooq.tables.CodeMaster.CODE_MASTER;

    /**
     * 커뮤니티 댓글
 - 현재 사용안함

     */
    public final CommunityComment COMMUNITY_COMMENT = com.ddastudio.fishing.jooq.tables.CommunityComment.COMMUNITY_COMMENT;

    /**
     * 커뮤니티 게시글
 - 현재 사용안함
     */
    public final CommunityContent COMMUNITY_CONTENT = com.ddastudio.fishing.jooq.tables.CommunityContent.COMMUNITY_CONTENT;

    /**
     * 어종 관리
 - 현재 사용 안함
     */
    public final FishMaster FISH_MASTER = com.ddastudio.fishing.jooq.tables.FishMaster.FISH_MASTER;

    /**
     * The table <code>fishing_reservation.my_news</code>.
     */
    public final MyNews MY_NEWS = com.ddastudio.fishing.jooq.tables.MyNews.MY_NEWS;

    /**
     * The table <code>fishing_reservation.oauth_client_details</code>.
     */
    public final OauthClientDetails OAUTH_CLIENT_DETAILS = com.ddastudio.fishing.jooq.tables.OauthClientDetails.OAUTH_CLIENT_DETAILS;

    /**
     * 예약 관리
     */
    public final Reservation RESERVATION = com.ddastudio.fishing.jooq.tables.Reservation.RESERVATION;

    /**
     * The table <code>fishing_reservation.reservation_history</code>.
     */
    public final ReservationHistory RESERVATION_HISTORY = com.ddastudio.fishing.jooq.tables.ReservationHistory.RESERVATION_HISTORY;

    /**
     * 예약대기 관리
     */
    public final ReservationWaiting RESERVATION_WAITING = com.ddastudio.fishing.jooq.tables.ReservationWaiting.RESERVATION_WAITING;

    /**
     * 일정 관리
 - 관리자가 입력
 - 하나의 배는 from_time이 겹치지 않으면 하루에 여러건의 일정 등록이 가능
 - 일정이 등록되어야 예약이 가능함
 - 일정 등록화면에서 배를 선택하게 되면 boat_master 테이블에 저장된 값을 기본값으로 from_time, to_time, fish_type, capacity, price, captain_id 값을 세팅해줌
     */
    public final Schedule SCHEDULE = com.ddastudio.fishing.jooq.tables.Schedule.SCHEDULE;

    /**
     * The table <code>fishing_reservation.test_master</code>.
     */
    public final TestMaster TEST_MASTER = com.ddastudio.fishing.jooq.tables.TestMaster.TEST_MASTER;

    /**
     * The table <code>fishing_reservation.used_refresh_token</code>.
     */
    public final UsedRefreshToken USED_REFRESH_TOKEN = com.ddastudio.fishing.jooq.tables.UsedRefreshToken.USED_REFRESH_TOKEN;

    /**
     * 사용자 관리
     */
    public final User USER = com.ddastudio.fishing.jooq.tables.User.USER;

    /**
     * No further instances allowed
     */
    private FishingReservation() {
        super("fishing_reservation", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Account.ACCOUNT,
            AppMaster.APP_MASTER,
            BankMaster.BANK_MASTER,
            BoatMaster.BOAT_MASTER,
            CodeMaster.CODE_MASTER,
            CommunityComment.COMMUNITY_COMMENT,
            CommunityContent.COMMUNITY_CONTENT,
            FishMaster.FISH_MASTER,
            MyNews.MY_NEWS,
            OauthClientDetails.OAUTH_CLIENT_DETAILS,
            Reservation.RESERVATION,
            ReservationHistory.RESERVATION_HISTORY,
            ReservationWaiting.RESERVATION_WAITING,
            Schedule.SCHEDULE,
            TestMaster.TEST_MASTER,
            UsedRefreshToken.USED_REFRESH_TOKEN,
            User.USER);
    }
}
