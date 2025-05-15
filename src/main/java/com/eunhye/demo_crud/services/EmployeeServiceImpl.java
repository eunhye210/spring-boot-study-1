package com.eunhye.demo_crud.services;

import com.eunhye.demo_crud.dtos.EmployeeDTO;
import com.eunhye.demo_crud.dtos.EmployeeResponseDTO;
import com.eunhye.demo_crud.entities.Employee;
import com.eunhye.demo_crud.mapper.EmployeeMapper;
import com.eunhye.demo_crud.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeResponseDTO createEmployee(EmployeeDTO employeeDTO) {
        return null;
    }

    @Override
    public EmployeeResponseDTO getEmployeeById(String employeeId) {
        return null;
    }

    @Override
    public List<EmployeeResponseDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();

        return employees
                .stream()
                .map(EmployeeMapper::mapToEmployeeResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteEmployee(String employeeId) {

    }

    @Override
    public EmployeeResponseDTO updateEmployee(String employeeId, EmployeeDTO employeeDTO) {
        return null;
    }
}
