package br.com.restaurant.management.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestauranteController {

    @GetMapping("/")
    public String hello() {
        return "Hello People!!";
    }
}
