package com.spring.project.openwebinars.primary;

import org.springframework.stereotype.Service;

@Service
public class CustomerBServiceImpl implements CustomerService{

    @Override
    public String hello() {
        return "Hello Customer B";
    }
}
