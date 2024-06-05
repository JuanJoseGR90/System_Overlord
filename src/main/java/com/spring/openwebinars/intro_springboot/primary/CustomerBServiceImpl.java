package com.spring.openwebinars.intro_springboot.primary;

import org.springframework.stereotype.Service;

@Service
public class CustomerBServiceImpl implements CustomerService{

    @Override
    public String hello() {
        return "Hello Customer B";
    }
}
