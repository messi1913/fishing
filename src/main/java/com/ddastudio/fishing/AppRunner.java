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
import com.ddastudio.fishing.ships.BoatMasterDTO;
import com.ddastudio.fishing.ships.BoatMasterRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.bouncycastle.math.raw.Mod;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
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
    
    @Autowired
    ModelMapper modelMapper;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        BoatMasterRecord boatById = dao.getBoatById(1);
        BoatMasterDTO map = modelMapper.map(boatById, BoatMasterDTO.class);

        Gson gson = new Gson();
        String s1 = gson.toJson(map);
        System.out.println(s1);




    }
}
