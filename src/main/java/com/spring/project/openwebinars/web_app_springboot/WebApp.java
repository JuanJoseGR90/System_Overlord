package com.spring.project.openwebinars.web_app_springboot;

import com.spring.project.openwebinars.web_app_springboot.entity.Product;
import com.spring.project.openwebinars.web_app_springboot.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class WebApp {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(WebApp.class, args);

        var repository = context.getBean(ProductRepository.class);

        List<Product> products = List.of(
                new Product(null, "producto1", 3.99, 1),
                new Product(null, "producto2", 7.99, 4),
                new Product(null, "producto3", 5.99, 6),
                new Product(null, "producto4", 9.99, 3)
        );

        repository.saveAll(products);
    }
}
