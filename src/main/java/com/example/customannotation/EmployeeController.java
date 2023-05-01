package com.example.customannotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {

    @Logger("Employee viewed.")
    @GetMapping("/employees/{id}")
    void one(@PathVariable Long id) {
        System.out.println("custom tested properly:"+id);
    }
}
