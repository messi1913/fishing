//package com.ddastudio.fishing;
//
//import com.ddastudio.fishing.accounts.domain.AccountRepository;
//import com.ddastudio.fishing.common.AppProperties;
//
//import com.ddastudio.fishing.boats.BoatMasterDAO;
//import com.ddastudio.fishing.boats.BoatMasterRepository;
//import org.jooq.DSLContext;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import javax.persistence.EntityManager;
//import javax.transaction.Transactional;
//
//@Service
//public class AppRunner implements ApplicationRunner {
//
//    @Autowired
//    BoatMasterRepository repository;
//
//    @Autowired
//    AccountRepository accountRepository;
//
//    @Autowired
//    PasswordEncoder passwordEncoder;
//
//    @Autowired
//    AppProperties pw;
//
//    @Autowired
//    EntityManager manager;
//
//    @Autowired
//    BoatMasterDAO dao;
//
//    @Autowired
//    ModelMapper modelMapper;
//
//    @Autowired
//    DSLContext dslContext;
//
//    @Override
//    @Transactional
//    public void run(ApplicationArguments args) throws Exception {
////        dslContext.insertInto(CodeMaster.CODE_MASTER,
////                                CodeMaster.CODE_MASTER.TYPE_CODE,
////                                CodeMaster.CODE_MASTER.CODE,
////                                CodeMaster.CODE_MASTER.CODE_NAME,
////                                CodeMaster.CODE_MASTER.RMK,
////                                CodeMaster.CODE_MASTER.USE_YN,
////                                CodeMaster.CODE_MASTER.CREATED)
////                    .values("ACCOUNT_STATUS", "NML", "Normal", "account.status", "Y", LocalDateTime.now())
////                .execute();
////
////        dslContext.insertInto(CodeMaster.CODE_MASTER,
////                CodeMaster.CODE_MASTER.TYPE_CODE,
////                CodeMaster.CODE_MASTER.CODE,
////                CodeMaster.CODE_MASTER.CODE_NAME,
////                CodeMaster.CODE_MASTER.RMK,
////                CodeMaster.CODE_MASTER.USE_YN,
////                CodeMaster.CODE_MASTER.CREATED)
////                .values("ACCOUNT_STATUS", "REQ", "Request", "account.status", "Y", LocalDateTime.now())
////                .execute();
////
////        dslContext.insertInto(CodeMaster.CODE_MASTER,
////                CodeMaster.CODE_MASTER.TYPE_CODE,
////                CodeMaster.CODE_MASTER.CODE,
////                CodeMaster.CODE_MASTER.CODE_NAME,
////                CodeMaster.CODE_MASTER.RMK,
////                CodeMaster.CODE_MASTER.USE_YN,
////                CodeMaster.CODE_MASTER.CREATED)
////                .values("ACCOUNT_STATUS", "LEA", "Leave", "account.status", "Y", LocalDateTime.now())
////                .execute();
//
//
//
//
//
//    }
//}
