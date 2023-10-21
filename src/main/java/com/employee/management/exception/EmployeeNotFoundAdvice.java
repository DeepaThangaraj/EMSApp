package com.employee.management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Latitude
 * @project management
 * @created 17/10/2023-12:44 PM
 */
@ControllerAdvice
public class EmployeeNotFoundAdvice {


    @ResponseBody
    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> exceptionHandler(EmployeeNotFoundException employeeNotFoundException)
    {
        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("errorMessage",employeeNotFoundException.getMessage());
        return errorMap;

    }
}
