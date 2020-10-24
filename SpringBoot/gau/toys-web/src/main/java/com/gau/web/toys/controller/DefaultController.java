package com.gau.web.toys.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toys/api/")
public class DefaultController {

    @Value("${spring.application.name:Gau's Toy}")
    private String APP_NAME;

    @GetMapping("/hello")
    public String hello() {
        return APP_NAME;
    }
}
