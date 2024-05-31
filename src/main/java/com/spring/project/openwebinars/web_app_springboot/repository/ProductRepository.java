package com.spring.project.openwebinars.web_app_springboot.repository;

import com.spring.project.openwebinars.web_app_springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}