package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Rest {

    @Value("application.name")
    private String applicationName;

    @Value("instructor.name")
    private String instructorName;

    @Value("instructor.department")
    private String instructorDepartment;

    @GetMapping("/instructor")
    public String instructor() {
        return instructorName + " " + instructorDepartment + " " + applicationName;
    }

}
