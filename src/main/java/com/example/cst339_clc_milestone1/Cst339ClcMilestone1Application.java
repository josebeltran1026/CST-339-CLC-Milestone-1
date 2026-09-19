package com.example.cst339_clc_milestone1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Cst339ClcMilestone1Application {

    public static void main(String[] args) {
        SpringApplication.run(Cst339ClcMilestone1Application.class, args);
    }

}