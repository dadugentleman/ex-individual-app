package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Rest {

    @GetMapping("/info")
    public String info() {
        return printInfo();
    }

    @Value("${instructor.name}")
    private String instructorName;

    @Value("${instructor.department}")
    private String instructorDepartment;

    public String printInfo() {
        return "Instructor Name: " + instructorName + "<br> Department: " + instructorDepartment;
    }



}
