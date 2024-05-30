package com.spring.project.openwebinars.controller;

import com.spring.project.openwebinars.primary.CustomerService;
import com.spring.project.openwebinars.service.EmployeeService;
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
