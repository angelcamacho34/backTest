package com.intercam.test.repository;

import com.intercam.test.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    // Parse the findById to return a Employee Object
    Employee findById(int integer);

}
