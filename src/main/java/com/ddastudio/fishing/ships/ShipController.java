package com.ddastudio.fishing.ships;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class ShipController {

    @GetMapping
    public Mono<String> getShips() {
        return Mono.just("GET Method : ships");
    }

    @GetMapping
    public Mono<String> getShip(int id) {
        return Mono.just("GET Method : ship "+id);
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
