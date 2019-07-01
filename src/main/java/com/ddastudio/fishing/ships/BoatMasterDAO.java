package com.ddastudio.fishing.ships;


import com.ddastudio.fishing.jooq.tables.BoatMaster;
import com.ddastudio.fishing.jooq.tables.records.BoatMasterRecord;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.JsonElement;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class BoatMasterDAO {

    private final DSLContext dsl;
    private final BoatMaster BOAT_MASTER = BoatMaster.BOAT_MASTER;

    public BoatMasterRecord getBoatById(Integer id) {
        return dsl.select()
                    .from(BOAT_MASTER)
                    .where(BOAT_MASTER.ID.equal(id))
                .fetchOneInto(BoatMasterRecord.class);
    }
}
