package com.ddastudio.fishing.ships;


import com.ddastudio.fishing.jooq.tables.BoatMaster;
import com.ddastudio.fishing.jooq.tables.records.BoatMasterRecord;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoatMasterDAO {

    private final DSLContext dsl;

    public List<BoatMasterRecord> test(){
         return dsl.select().from(BoatMaster.BOAT_MASTER).where(BoatMaster.BOAT_MASTER.APP_ID.equal(100)).fetchInto(BoatMasterRecord.class);
    }

    public List<Integer> test2(){
        return dsl.select().from(BoatMaster.BOAT_MASTER).where(BoatMaster.BOAT_MASTER.APP_ID.equal(100)).fetch(BoatMaster.BOAT_MASTER.ID);
    }

//    public int test2(){
//        dsl.insertInto(dsl.insertInto(BoatMaster.BOAT_MASTER,
//                BoatMaster.BOAT_MASTER.ID,
//                BoatMaster.BOAT_MASTER.APP_ID,
//                BoatMaster.BOAT_MASTER.NAME,
//                BoatMaster.BOAT_MASTER.FROM_TIME,
//                BoatMaster.BOAT_MASTER.USE_YN,
//                BoatMaster.BOAT_MASTER.CREATED,
//                BoatMaster.BOAT_MASTER.FISH_TYPE
//        )
//    }
}
