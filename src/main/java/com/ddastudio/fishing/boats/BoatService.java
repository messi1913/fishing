//package com.ddastudio.fishing.boats;
//
//import com.google.gson.Gson;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//import reactor.core.publisher.Mono;
//import reactor.core.scheduler.Schedulers;
//
//@Service
//@RequiredArgsConstructor
//@Slf4j
//public class BoatService {
//
//    private final BoatMasterRepository repository;
//    private final BoatMasterDAO dao;
//
//    Mono<String> getBoatMasterById(Integer id) {
//        log.info("===== Start getBoatMasterById =====");
//
//        return Mono.fromCallable(()-> {
//            Gson gson = new Gson();
//            return gson.toJson(BoatMasterDTO.of(dao.getBoatById(id)));
//            })
//                .subscribeOn(Schedulers.elastic())
//                .log();
//    }
//
//
//
//}
