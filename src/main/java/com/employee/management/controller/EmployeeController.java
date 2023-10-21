package com.employee.management.controller;

import com.employee.management.service.EmployeeService;
import com.employee.management.Entities.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Latitude
 * @project management
 * @created 16/10/2023-11:43 AM
 */
@CrossOrigin("http://localhost:3000/*")
@RestController
@RequestMapping("/v1")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employee-list")
    public ResponseEntity<List<Employee>> getEmployee()
    {
        try
        {
            List<Employee> employees=new ArrayList<>();
            employees=employeeService.getAllEmployees();
            return new ResponseEntity<>(employees, HttpStatus.OK);
        }
        catch(Exception e) {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/employee-list/employee-by-id/{employee_id}")
    @PreAuthorize("hasRole('admin')")
    public ResponseEntity<Employee> getEmployeeDetail(@PathVariable Long employee_id)
    {

           Employee employee=employeeService.getEmployeeDetails(employee_id);

           return new ResponseEntity<>(employee,HttpStatus.OK);


    }
    @PostMapping("/employee-list/save-employee")
    public ResponseEntity<Employee> saveEmployeeData(@RequestBody Employee employee)
    {
        try
        {
            Employee returnEmployee=employeeService.saveEmployee(employee);
            return new ResponseEntity<>(returnEmployee,HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
