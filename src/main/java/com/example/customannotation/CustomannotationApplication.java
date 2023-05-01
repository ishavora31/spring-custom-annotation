package com.example.customannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CustomannotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomannotationApplication.class, args);
    }

}
