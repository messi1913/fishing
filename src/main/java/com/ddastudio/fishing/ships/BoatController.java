package com.ddastudio.fishing.ships;

import com.ddastudio.fishing.jooq.tables.records.BoatMasterRecord;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/boats")
@RequiredArgsConstructor
public class BoatController {

    private final BoatService service;

    @GetMapping
    public Mono<String> getShips() {
        return Mono.just("GET Method : ships");
    }

    @GetMapping("{id}")
    public Mono<String> getShip(@PathVariable Integer id) throws JsonProcessingException {
        BoatMasterDTO boatMasterDTO = service.getBoatMasterById(id);
        Gson gson = new Gson();
        return Mono.just(gson.toJson(boatMasterDTO));
    }

    @PostMapping
    public Mono<String> createShip() {
        return Mono.just("POST Method : create ship");
    }

    @PutMapping
    public Mono<String> modifyShip() {
        return Mono.just("PUT Method : modify ship");
    }

    @DeleteMapping
    public Mono<String> deleteShip() {
        return Mono.just("Delete Method : delete ship");
    }

}
