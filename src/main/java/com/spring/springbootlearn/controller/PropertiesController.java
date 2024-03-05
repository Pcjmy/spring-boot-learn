package com.spring.springbootlearn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Value("${school.grade}")
    Integer grade;

    @Value("${school.classnum}")
    Integer classnum;

    static Integer age;

    @GetMapping("/gradeclass")
    public String gradeClass() {
        return "grade: " + grade + " class: " + classnum;
    }

    @GetMapping("/static")
    public String staticPara() {
        return "static: " + age;
    }

    @Value("${school.age}")
    public void setAge(Integer age) {
        PropertiesController.age = age;
    }
}
