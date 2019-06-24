package com.ddastudio.fishing.schedules;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/schedules")
public class SchedulerController {

    @GetMapping
    public Mono<String> getSchedules() {
        return Mono.just("GET Method : schedules");
    }

    @GetMapping("{id}")
    public Mono<String> getSchedule(int id) {
        return Mono.just("GET Method : schedule "+id);
    }

    @PostMapping
    public Mono<String> createSchedule() {
        return Mono.just("POST Method : create schedule");
    }

    @PutMapping
    public Mono<String> modifySchedule() {
        return Mono.just("PUT Method : modify schedule");
    }

    @DeleteMapping
    public Mono<String> deleteSchedule() {
        return Mono.just("Delete Method : delete schedule");
    }
}
