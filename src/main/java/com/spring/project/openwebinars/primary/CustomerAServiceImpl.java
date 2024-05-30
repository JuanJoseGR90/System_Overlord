package com.spring.project.openwebinars.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service
public class CustomerAServiceImpl implements CustomerService {

    @Override
    public String hello() {
        return "Hello Customer A";
    }
}
