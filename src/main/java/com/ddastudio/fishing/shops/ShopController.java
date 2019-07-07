//package com.ddastudio.fishing.shops;
//
//import org.springframework.web.bind.annotation.*;
//import reactor.core.publisher.Mono;
//
//@RestController
//@RequestMapping("api/shops")
//public class ShopController {
//
//    @GetMapping
//    public Mono<String> getShops() {
//        return Mono.just("GET Method : shops");
//    }
//
//    @GetMapping("{id}")
//    public Mono<String> getShop(int id) {
//        return Mono.just("GET Method : shop "+id);
//    }
//
//    @PostMapping
//    public Mono<String> createShop() {
//        return Mono.just("POST Method : create shop");
//    }
//
//    @PutMapping
//    public Mono<String> modifyShop() {
//        return Mono.just("PUT Method : modify Shop");
//    }
//
//    @DeleteMapping
//    public Mono<String> deleteShop() {
//        return Mono.just("Delete Method : delete Shop");
//    }
//
//}
