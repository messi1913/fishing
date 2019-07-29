/*
 * This file is generated by jOOQ.
 */
package com.ddastudio.fishing.jooq;


import com.ddastudio.fishing.jooq.tables.Account;
import com.ddastudio.fishing.jooq.tables.AppMaster;
import com.ddastudio.fishing.jooq.tables.BoatMaster;
import com.ddastudio.fishing.jooq.tables.CodeMaster;
import com.ddastudio.fishing.jooq.tables.CommunityContent;
import com.ddastudio.fishing.jooq.tables.FishMaster;
import com.ddastudio.fishing.jooq.tables.FishingEnvironment;
import com.ddastudio.fishing.jooq.tables.MyNews;
import com.ddastudio.fishing.jooq.tables.OauthClientDetails;
import com.ddastudio.fishing.jooq.tables.Reservation;
import com.ddastudio.fishing.jooq.tables.ReservationHistory;
import com.ddastudio.fishing.jooq.tables.Schedule;
import com.ddastudio.fishing.jooq.tables.TestMaster;
import com.ddastudio.fishing.jooq.tables.UsedRefreshToken;
import com.ddastudio.fishing.jooq.tables.User;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>fishing_reservation</code> 
 * schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACCOUNT_PRIMARY = Indexes0.ACCOUNT_PRIMARY;
    public static final Index ACCOUNT_UK_3CHG059P7XVAFVSVRO01UBODQ = Indexes0.ACCOUNT_UK_3CHG059P7XVAFVSVRO01UBODQ;
    public static final Index APP_MASTER_PRIMARY = Indexes0.APP_MASTER_PRIMARY;
    public static final Index BOAT_MASTER_PRIMARY = Indexes0.BOAT_MASTER_PRIMARY;
    public static final Index CODE_MASTER_CODE_MASTER_PK = Indexes0.CODE_MASTER_CODE_MASTER_PK;
    public static final Index COMMUNITY_CONTENT_PRIMARY = Indexes0.COMMUNITY_CONTENT_PRIMARY;
    public static final Index FISH_MASTER_FISH_MASTER_ID_UINDEX = Indexes0.FISH_MASTER_FISH_MASTER_ID_UINDEX;
    public static final Index FISHING_ENVIRONMENT_PRIMARY = Indexes0.FISHING_ENVIRONMENT_PRIMARY;
    public static final Index MY_NEWS_PRIMARY = Indexes0.MY_NEWS_PRIMARY;
    public static final Index OAUTH_CLIENT_DETAILS_PRIMARY = Indexes0.OAUTH_CLIENT_DETAILS_PRIMARY;
    public static final Index RESERVATION_PRIMARY = Indexes0.RESERVATION_PRIMARY;
    public static final Index RESERVATION_HISTORY_PRIMARY = Indexes0.RESERVATION_HISTORY_PRIMARY;
    public static final Index SCHEDULE_APP_ID = Indexes0.SCHEDULE_APP_ID;
    public static final Index SCHEDULE_PRIMARY = Indexes0.SCHEDULE_PRIMARY;
    public static final Index TEST_MASTER_PRIMARY = Indexes0.TEST_MASTER_PRIMARY;
    public static final Index USED_REFRESH_TOKEN_PRIMARY = Indexes0.USED_REFRESH_TOKEN_PRIMARY;
    public static final Index USER_PRIMARY = Indexes0.USER_PRIMARY;
    public static final Index USER_PROVIDER_PROVIDER_UID = Indexes0.USER_PROVIDER_PROVIDER_UID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ACCOUNT_PRIMARY = Internal.createIndex("PRIMARY", Account.ACCOUNT, new OrderField[] { Account.ACCOUNT.ID }, true);
        public static Index ACCOUNT_UK_3CHG059P7XVAFVSVRO01UBODQ = Internal.createIndex("UK_3chg059p7xvafvsvro01ubodq", Account.ACCOUNT, new OrderField[] { Account.ACCOUNT.PHONE_NO }, true);
        public static Index APP_MASTER_PRIMARY = Internal.createIndex("PRIMARY", AppMaster.APP_MASTER, new OrderField[] { AppMaster.APP_MASTER.ID }, true);
        public static Index BOAT_MASTER_PRIMARY = Internal.createIndex("PRIMARY", BoatMaster.BOAT_MASTER, new OrderField[] { BoatMaster.BOAT_MASTER.ID }, true);
        public static Index CODE_MASTER_CODE_MASTER_PK = Internal.createIndex("code_master_pk", CodeMaster.CODE_MASTER, new OrderField[] { CodeMaster.CODE_MASTER.TYPE_CODE, CodeMaster.CODE_MASTER.CODE }, true);
        public static Index COMMUNITY_CONTENT_PRIMARY = Internal.createIndex("PRIMARY", CommunityContent.COMMUNITY_CONTENT, new OrderField[] { CommunityContent.COMMUNITY_CONTENT.ID }, true);
        public static Index FISH_MASTER_FISH_MASTER_ID_UINDEX = Internal.createIndex("fish_master_id_uindex", FishMaster.FISH_MASTER, new OrderField[] { FishMaster.FISH_MASTER.ID }, true);
        public static Index FISHING_ENVIRONMENT_PRIMARY = Internal.createIndex("PRIMARY", FishingEnvironment.FISHING_ENVIRONMENT, new OrderField[] { FishingEnvironment.FISHING_ENVIRONMENT.ID }, true);
        public static Index MY_NEWS_PRIMARY = Internal.createIndex("PRIMARY", MyNews.MY_NEWS, new OrderField[] { MyNews.MY_NEWS.ID }, true);
        public static Index OAUTH_CLIENT_DETAILS_PRIMARY = Internal.createIndex("PRIMARY", OauthClientDetails.OAUTH_CLIENT_DETAILS, new OrderField[] { OauthClientDetails.OAUTH_CLIENT_DETAILS.CLIENT_ID }, true);
        public static Index RESERVATION_PRIMARY = Internal.createIndex("PRIMARY", Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.ID }, true);
        public static Index RESERVATION_HISTORY_PRIMARY = Internal.createIndex("PRIMARY", ReservationHistory.RESERVATION_HISTORY, new OrderField[] { ReservationHistory.RESERVATION_HISTORY.RESERVATION_ID, ReservationHistory.RESERVATION_HISTORY.SEQ }, true);
        public static Index SCHEDULE_APP_ID = Internal.createIndex("app_id", Schedule.SCHEDULE, new OrderField[] { Schedule.SCHEDULE.APP_ID, Schedule.SCHEDULE.BOAT_ID, Schedule.SCHEDULE.YYYYMMDD, Schedule.SCHEDULE.FROM_TIME }, true);
        public static Index SCHEDULE_PRIMARY = Internal.createIndex("PRIMARY", Schedule.SCHEDULE, new OrderField[] { Schedule.SCHEDULE.ID }, true);
        public static Index TEST_MASTER_PRIMARY = Internal.createIndex("PRIMARY", TestMaster.TEST_MASTER, new OrderField[] { TestMaster.TEST_MASTER.ID }, true);
        public static Index USED_REFRESH_TOKEN_PRIMARY = Internal.createIndex("PRIMARY", UsedRefreshToken.USED_REFRESH_TOKEN, new OrderField[] { UsedRefreshToken.USED_REFRESH_TOKEN.TOKEN }, true);
        public static Index USER_PRIMARY = Internal.createIndex("PRIMARY", User.USER, new OrderField[] { User.USER.ID }, true);
        public static Index USER_PROVIDER_PROVIDER_UID = Internal.createIndex("provider_provider_uid", User.USER, new OrderField[] { User.USER.PROVIDER, User.USER.PROVIDER_UID }, false);
    }
}
