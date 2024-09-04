package com.example.customejpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customejpa.entity.Employee;
import com.example.customejpa.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployeesByCustomCriteria(String criteria) {
        return employeeRepository.findEmployeesByCustomCriteria(criteria);
    }
}
