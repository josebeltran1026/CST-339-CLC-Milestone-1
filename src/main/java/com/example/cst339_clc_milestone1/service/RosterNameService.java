package com.example.cst339_clc_milestone1.service;

import com.example.cst339_clc_milestone1.dto.RosterNameDto;
import org.springframework.stereotype.Service;

@Service
public class RosterNameService {

    public RosterNameDto getRosterName() {
        return new RosterNameDto("Jose Beltran");
    }
}
