package com.eunhye.demo_crud.repositories;

import com.eunhye.demo_crud.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    boolean existsByEmail(String email);
    Employee findByEmail(String email);
}
