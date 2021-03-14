package com.spring.componentmapping.cmapping.repos;

import com.spring.componentmapping.cmapping.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
