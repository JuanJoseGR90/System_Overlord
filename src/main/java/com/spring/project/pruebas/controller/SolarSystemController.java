package com.spring.project.pruebas.controller;

import com.spring.project.pruebas.service.SolarSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SolarSystemController {

    @Autowired
    private SolarSystemService solarSystemService;

    public String earth () {
        return this.solarSystemService.earth();
    }
}
