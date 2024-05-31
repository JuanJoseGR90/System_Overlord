package com.spring.project.openwebinars.intro_springdatajpa;

import com.spring.project.openwebinars.intro_springdatajpa.model.Employee;
import com.spring.project.openwebinars.intro_springdatajpa.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class AppJpa {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AppJpa.class, args);

        var a = context.getBean(EmployeeRepository.class);

        List<Employee> employees = List.of(
                new Employee(null, "Empleado1", LocalDate.now(), false),
                new Employee(null, "Empleado2", LocalDate.now(), true),
                new Employee(null, "Empleado3", LocalDate.now(), false),
                new Employee(null, "Empleado4", LocalDate.now(), true)
        );

        a.saveAll(employees);

        a.findAllByMarriedTrue().forEach(System.out::println);
    }
}
