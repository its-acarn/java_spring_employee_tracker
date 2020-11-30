package com.codeclan.example.EmployeeTracker.controllers;

import com.codeclan.example.EmployeeTracker.models.Employee;
import com.codeclan.example.EmployeeTracker.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository theEmployeeRepository;

    @GetMapping(value="/employee")
    public List<Employee> getAllEmployees(){
        return theEmployeeRepository.findAll();
    }

    @GetMapping(value="/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return theEmployeeRepository.findById(id);
    }

    @PostMapping(value="employee/{id}")
    public void deleteEmployee(@PathVariable Long id){
        theEmployeeRepository.deleteById(id);
    }
}
