package com.spring.springbootlearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParaController {

    @GetMapping("/firstrequest")
    public String firstRequest() {
        return "Hello Spring Boot";
    }

    @GetMapping("/para")
    public String requestPara(@RequestParam Integer num) {
        return "para: " + num;
    }
}
