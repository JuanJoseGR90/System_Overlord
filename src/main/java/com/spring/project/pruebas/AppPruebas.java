package com.spring.project.pruebas;

import com.spring.project.pruebas.controller.SolarSystemController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppPruebas {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AppPruebas.class, args);

        var a = context.getBean(SolarSystemController.class);

        System.out.println("\n"+a.earth());
    }
}
