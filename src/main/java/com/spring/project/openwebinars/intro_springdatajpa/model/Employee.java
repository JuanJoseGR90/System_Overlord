package com.spring.project.openwebinars.intro_springdatajpa.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Full_Name", unique = false)
    private String fullName;

    @Column(name = "Birthday", unique = false)
    private LocalDate birthdate;

    @Column(name = "Married", unique = false )
    private boolean married;

    public Employee() {

    }

    public Employee(Long id, String fullName, LocalDate birthdate, boolean married) {
        this.id = id;
        this.fullName = fullName;
        this.birthdate = birthdate;
        this.married = married;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthdate=" + birthdate +
                ", married=" + married +
                '}';
    }
}
