package com.spring.project.pruebas.controller;

import com.spring.project.pruebas.service.BioImplService;
import com.spring.project.pruebas.service.SolarSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SolarSystemController {

    private SolarSystemService solarSystemService;

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
