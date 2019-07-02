package com.ddastudio.fishing.boats;


import com.ddastudio.fishing.jooq.tables.BoatMaster;
import com.ddastudio.fishing.jooq.tables.records.BoatMasterRecord;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoatMasterDAO {

    private final DSLContext dsl;
    private BoatMaster BOAT_MASTER = BoatMaster.BOAT_MASTER;

    public BoatMasterRecord getBoatById(Integer id) {
        return dsl.select()
                    .from(BOAT_MASTER)
                    .where(BOAT_MASTER.ID.equal(id))
                .fetchOneInto(BoatMasterRecord.class);
    }
}
