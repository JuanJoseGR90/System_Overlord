package com.spring.openwebinars.intro_springdatajpa.repository;

import com.spring.openwebinars.intro_springdatajpa.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long> {

}
