package com.teja.employee.service;
import com.teja.employee.entity.Employee;
import com.teja.employee.exception.EmployeeNotFoundException;
import com.teja.employee.repository.employeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final employeeRepository employeeRepository;

    public EmployeeService(employeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get employee by ID
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with ID"+id+"not found"));
    }

    // Add employee
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Update employee
    public Employee updateEmployee(Integer id, Employee employee) {

        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        existingEmployee.setEmpName(employee.getEmpName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setSalary(employee.getSalary());
        existingEmployee.setJoiningDate(employee.getJoiningDate());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setManager(employee.getManager());
        existingEmployee.setState(employee.getState());

        return employeeRepository.save(existingEmployee);
    }

    // Delete employee
    public void deleteEmployee(Integer id) {

        if (!employeeRepository.existsById(id)) {
            throw new EmployeeNotFoundException("Employee with ID "+id+"not found");
        }

        employeeRepository.deleteById(id);
    }
}
