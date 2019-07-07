//package com.ddastudio.fishing.boats;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.*;
//import reactor.core.publisher.Mono;
//
//@RestController
//@RequestMapping("api/boats")
//@RequiredArgsConstructor
//@Slf4j
//public class BoatController {
//
//    private final BoatService service;
//
//    @GetMapping
//    public Mono<String> getShips() {
//        return Mono.just("GET Method : boats");
//    }
//
//    @GetMapping("{id}")
//    public Mono<String> getBoat(@PathVariable Integer id) {
//        log.info("====== Controller getBoat");
//        return service.getBoatMasterById(id);
//    }
//
//    @PostMapping
//    public Mono<String> createShip() {
//        return Mono.just("POST Method : create ship");
//    }
//
//    @PutMapping
//    public Mono<String> modifyShip() {
//        return Mono.just("PUT Method : modify ship");
//    }
//
//    @DeleteMapping
//    public Mono<String> deleteShip() {
//        return Mono.just("Delete Method : delete ship");
//    }
//
//}
