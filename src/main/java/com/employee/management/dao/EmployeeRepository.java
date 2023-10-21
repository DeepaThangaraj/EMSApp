package com.employee.management.dao;

import com.employee.management.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Latitude
 * @project management
 * @created 16/10/2023-8:17 PM
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
