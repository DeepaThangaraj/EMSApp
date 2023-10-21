package com.employee.management.exception;

/**
 * @author Latitude
 * @project management
 * @created 17/10/2023-12:34 PM
 */
public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(Long employee_id)
    {
        super("Could not found the employee with the given employee ID "+employee_id);
    }
}
