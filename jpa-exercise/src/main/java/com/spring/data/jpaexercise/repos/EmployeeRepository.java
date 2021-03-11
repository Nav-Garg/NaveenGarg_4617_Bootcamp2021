package com.spring.data.jpaexercise.repos;

import com.spring.data.jpaexercise.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
      List<Employee>findByName(String name);

      List<Employee>findByAgeBetween(int age1, int age2);

      List<Employee>findByNameLike(String name);
}
