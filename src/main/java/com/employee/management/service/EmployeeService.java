package com.employee.management.service;

import com.employee.management.Entities.Employee;
import com.employee.management.dao.EmployeeRepository;
import com.employee.management.exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Latitude
 * @project management
 * @created 16/10/2023-8:23 PM
 */
@Service
public class EmployeeService {

     private Employee employee;
     @Autowired
     private EmployeeRepository employeeRepository;

     public List<Employee> getAllEmployees()
     {

         return employeeRepository.findAll();
     }
     public Employee getEmployeeDetails(Long employee_id)
     {

         return employeeRepository.findById(employee_id).orElseThrow(()->new EmployeeNotFoundException(employee_id));

     }
     public Employee saveEmployee(Employee employee)
     {

         return employeeRepository.save(employee);
     }



}
