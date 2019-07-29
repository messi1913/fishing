package com.ddastudio.fishing.common.domain;

import com.ddastudio.fishing.accounts.domain.AccountDTO;
import com.ddastudio.fishing.jooq.tables.FishingEnvironment;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

import static com.ddastudio.fishing.common.Constants.USE;

@Repository
@RequiredArgsConstructor
public class EnvDAO {

    private final DSLContext query;

    private static com.ddastudio.fishing.jooq.tables.FishingEnvironment ENV = FishingEnvironment.FISHING_ENVIRONMENT;


    public Optional<String> getProperty(String key) {
         return query.select()
                .from(ENV)
                .where(ENV.ID.equal(key)
                    .and(ENV.USE_YN.equal(USE)))
                 .fetchOptional(ENV.PROPERTY);
    }

}
