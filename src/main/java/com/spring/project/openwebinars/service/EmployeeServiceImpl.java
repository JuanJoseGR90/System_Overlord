package com.spring.project.openwebinars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public String hello() {
        return "Hello World";
    }
}
