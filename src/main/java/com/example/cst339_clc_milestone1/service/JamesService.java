package com.example.cst339_clc_milestone1.service;

import org.springframework.stereotype.Service;

import com.example.cst339_clc_milestone1.dto.JamesDto;

@Service
public class JamesService {

    public JamesDto getJames() {
        return new JamesDto("James");
    }
}