package com.example.customejpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customejpa.customRepository.CustomEmployeeRepository;
import com.example.customejpa.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>, CustomEmployeeRepository {
    List<Employee> findByDepartment(String department);
}
