package com.example.cst339_clc_milestone1.controller;

import com.example.cst339_clc_milestone1.dto.RosterNameDto;
import com.example.cst339_clc_milestone1.service.RosterNameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RosterNameController {

    private final RosterNameService rosterNameService;

    public RosterNameController(RosterNameService rosterNameService) {
        this.rosterNameService = rosterNameService;
    }
    // Returns the roster name through the service layer.
    @GetMapping("/roster-name")
    public RosterNameDto getRosterName() {
        return rosterNameService.getRosterName();
    }
}