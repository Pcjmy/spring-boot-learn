package com.spring.springbootlearn.controller;

import com.spring.springbootlearn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：学生Controller
 */

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public String requestPara(@RequestParam Integer id) {
        return studentService.getStudent(id).toString();
    }
}
