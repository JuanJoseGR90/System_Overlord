package com.spring.project.openwebinars.intro_springboot.controller;

import com.spring.project.openwebinars.intro_springboot.primary.CustomerService;
import com.spring.project.openwebinars.intro_springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomerService customerService;

    public String hello () {
        return this.employeeService.hello();
    }

    public String helloCustomer () {
        return this.customerService.hello();
    }
}
