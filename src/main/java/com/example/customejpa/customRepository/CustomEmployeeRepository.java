package com.example.customejpa.customRepository;

import java.util.List;

import com.example.customejpa.entity.Employee;

public interface CustomEmployeeRepository {
	
    List<Employee> findEmployeesByCustomCriteria(String criteria);
}