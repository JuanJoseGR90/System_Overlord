package com.spring.project.openwebinars.intro_springboot;

import com.spring.project.openwebinars.intro_springboot.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppCurso {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AppCurso.class, args);

        var controller = context.getBean(EmployeeController.class);

        System.out.println(controller.hello());
        System.out.println(controller.helloCustomer());
    }
}
