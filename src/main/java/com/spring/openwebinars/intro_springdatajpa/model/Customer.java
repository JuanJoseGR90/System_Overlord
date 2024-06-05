package com.spring.openwebinars.intro_springdatajpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "E-mail")
    private String email;

    public Customer() {

    }

    public Customer(Long id, String fullName) {
        this.id = id;
        this.email = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + email + '\'' +
                '}';
    }
}
