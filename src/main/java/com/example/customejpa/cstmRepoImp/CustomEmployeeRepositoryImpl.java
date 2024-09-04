package com.example.customejpa.cstmRepoImp;

import java.util.List;
import com.example.customejpa.customRepository.CustomEmployeeRepository;
import com.example.customejpa.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

public class CustomEmployeeRepositoryImpl implements CustomEmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> findEmployeesByCustomCriteria(String criteria) {
        String query = "SELECT e FROM Employee e WHERE e.name LIKE :criteria";
        TypedQuery<Employee> typedQuery = entityManager.createQuery(query, Employee.class);
        typedQuery.setParameter("criteria", "%" + criteria + "%");
        return typedQuery.getResultList();
    }
}
