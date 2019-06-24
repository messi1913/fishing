package com.ddastudio.fishing.reservations;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@EnableAsync
public class ReservationService {

    @Async
    public CompletableFuture<String> getReservation() throws InterruptedException {
        Thread.sleep(3000);
        return CompletableFuture.completedFuture("test");
    }
}
