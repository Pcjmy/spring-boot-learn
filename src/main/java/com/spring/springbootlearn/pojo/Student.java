package com.spring.springbootlearn.pojo;

public class Student {

    Integer id;

    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
