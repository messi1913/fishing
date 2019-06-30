package com.ddastudio.fishing;

import com.ddastudio.fishing.accounts.domain.Account;
import com.ddastudio.fishing.accounts.domain.AccountRepository;
import com.ddastudio.fishing.common.AppProperties;
import com.ddastudio.fishing.common.domain.AppMaster;
import com.ddastudio.fishing.common.domain.AppMasterRepository;
import com.ddastudio.fishing.jooq.tables.BoatMaster;
import com.ddastudio.fishing.jooq.tables.records.BoatMasterRecord;
import com.ddastudio.fishing.ships.Boat;

import com.ddastudio.fishing.ships.BoatMasterDAO;
import com.ddastudio.fishing.ships.BoatMasterRepository;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AppRunner implements ApplicationRunner {

    @Autowired
    BoatMasterRepository repository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AppProperties pw;

    @Autowired
    EntityManager manager;

    @Autowired
    BoatMasterDAO dao;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        List<BoatMasterRecord> test = dao.test();

        String location = (String)test.get(0).getLocation();
        String types = (String)test.get(0).getFishType();

        System.out.println(types);



    }
}
