package com.spring.project.openwebinars.web_app_springboot.controller;

import com.spring.project.openwebinars.web_app_springboot.entity.Product;
import com.spring.project.openwebinars.web_app_springboot.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//  Define un controlador y que va a escuchar la URL products.
@Controller
@RequestMapping("/products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * http://localhost:8080/products
     * <p>
     * Busca todos los productos.
     *
     * @param model permite cargar datos.
     */
    @GetMapping
    public String findAll(Model model) {

        List<Product> products = this.productRepository.findAll();

        model.addAttribute("products", productRepository.findAll());

        return "products-list";
    }

    @GetMapping("/new")
    public String getForm(Model model) {

        model.addAttribute("products", new Product());

        return "products-list";
    }

    @PostMapping
    public String save(@ModelAttribute("product") Product product) {

        this.productRepository.save(product);

        return "redirect:/products";
    }
}
