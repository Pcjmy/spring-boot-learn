package com.spring.springbootlearn.controller;

import com.spring.springbootlearn.pojo.Student;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/para")
    public String postRequest(@RequestBody Student student) {
        return "para: " + student;
    }
}
