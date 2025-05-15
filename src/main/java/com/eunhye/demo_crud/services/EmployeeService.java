package com.eunhye.demo_crud.services;

import com.eunhye.demo_crud.dtos.EmployeeDTO;
import com.eunhye.demo_crud.dtos.EmployeeResponseDTO;

import java.util.List;


public interface EmployeeService {
    EmployeeResponseDTO createEmployee(EmployeeDTO employeeDTO);
    EmployeeResponseDTO getEmployeeById(String employeeId);
    List<EmployeeResponseDTO> getAllEmployees();
    void deleteEmployee(String employeeId);
    EmployeeResponseDTO updateEmployee(String employeeId, EmployeeDTO employeeDTO);
}
