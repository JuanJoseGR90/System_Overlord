package com.spring.project.pruebas;

import com.spring.project.openwebinars.controller.EmployeeController;
import com.spring.project.pruebas.controller.SolarSystemController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScan({"com.spring.project.openwebinars", "com.spring.project.pruebas"})
@SpringBootApplication
public class AppPruebas {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AppPruebas.class, args);

        var a = context.getBean(SolarSystemController.class);

        var b = context.getBean(EmployeeController.class);

        System.out.println("\n"+a.earth());

        System.out.println("\n"+a.mars());

        System.out.println("\n"+b.helloCustomer());
    }
}
