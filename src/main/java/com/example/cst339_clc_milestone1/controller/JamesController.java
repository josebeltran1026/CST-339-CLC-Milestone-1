package com.example.cst339_clc_milestone1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cst339_clc_milestone1.dto.JamesDto;
import com.example.cst339_clc_milestone1.service.JamesService;

@RestController
public class JamesController {

    private final JamesService jamesService;

    public JamesController(JamesService jamesService) {
        this.jamesService = jamesService;
    }

    @GetMapping("/james")
    public JamesDto getJames() {
        return jamesService.getJames();
    }
}