package com.gau.web.toys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.gau.web.toys.controller", "com.gau.web.toys.service"})
public class ToysWebStarter {

    public static void main(String[] args) {
        SpringApplication.run(ToysWebStarter.class, args);
    }
}
