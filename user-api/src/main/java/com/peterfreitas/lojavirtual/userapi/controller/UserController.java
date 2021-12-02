package com.peterfreitas.lojavirtual.userapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String getMensagem(){
        return "Spring Boot is working!";
    }
}