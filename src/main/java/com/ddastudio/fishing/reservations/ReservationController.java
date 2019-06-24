package com.ddastudio.fishing.reservations;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@Slf4j
@RestController
@RequestMapping("api/reservations")
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationService service;

    @GetMapping
    public Mono<String> getReservations() {
        return Mono.just("GET Method : Reservations");
    }

    @GetMapping
    public Mono<String> getReservation(int id) {
        return Mono.just("GET Method : Reservation "+id);
    }

    @PostMapping
    public Mono<String> createReservation() {
        return Mono.just("POST Method : create Reservation");
    }

    @PutMapping
    public Mono<String> saveReservation() {
        return Mono.just("PUT Method : save Reservation");
    }

    @PatchMapping
    public Mono<String> confirmReservation() {
        return Mono.just("PATCH Method : confirm Reservation");
    }

    @DeleteMapping
    public Mono<String> deleteReservation() {
        return Mono.just("Delete Method : delete Reservation");
    }

}
