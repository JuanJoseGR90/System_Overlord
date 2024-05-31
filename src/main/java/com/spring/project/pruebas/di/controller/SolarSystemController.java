package com.spring.project.pruebas.di.controller;

import com.spring.project.pruebas.di.service.SolarSystemService;
import org.springframework.stereotype.Controller;

@Controller
public class SolarSystemController {

    private final SolarSystemService solarSystemService;

    public SolarSystemController(SolarSystemService solarSystemService) {
        this.solarSystemService = solarSystemService;
    }

    public String earth () {
        return this.solarSystemService.earth();
    }

    public String mars () {
        return this.solarSystemService.mars();
    }

}
