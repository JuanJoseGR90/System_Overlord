package com.spring.project.openwebinars.intro_springdatajpa.repository;

import com.spring.project.openwebinars.intro_springdatajpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {

    Optional<Employee> findByFullName(String fullName);
    Optional<Employee> findByFullNameAndBirthdate(String fullName, LocalDate birthdate);
    List<Employee> findAllByBirthdateAfter(LocalDate birthdate);
    List<Employee> findAllByBirthdateBetween(LocalDate min, LocalDate max);
    List<Employee> findAllByMarriedTrue();
    List<Employee> findAllByMarriedFalse();


}
