package com.spring.project.pruebas.di;

import com.spring.openwebinars.intro_springboot.controller.EmployeeController;
import com.spring.project.pruebas.di.controller.SolarSystemController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.spring.project.openwebinars", "com.spring.project.pruebas"})
@SpringBootApplication
public class AppPruebas {

    public static void main(String[] args) {

//        Configuración
        ApplicationContext context = SpringApplication.run(AppPruebas.class, args);

//        Variables
        var a = context.getBean(SolarSystemController.class);
        var b = context.getBean(EmployeeController.class);

//        Ejecutar
        System.out.println("\n" + a.earth());
        System.out.println("\n" + a.mars());
        System.out.println("\n" + b.helloCustomer());

    }
}
