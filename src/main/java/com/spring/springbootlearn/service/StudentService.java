package com.spring.springbootlearn.service;

import com.spring.springbootlearn.mapper.StudentMapper;
import com.spring.springbootlearn.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  描述：查询学生信息
 */

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public Student getStudent(Integer id) {
        return studentMapper.findById(id);
    }
}
