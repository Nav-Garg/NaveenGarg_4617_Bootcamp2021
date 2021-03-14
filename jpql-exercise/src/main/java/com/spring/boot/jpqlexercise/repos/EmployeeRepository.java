package com.spring.boot.jpqlexercise.repos;

import com.spring.boot.jpqlexercise.entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    //Q1 jpql
    @Query("select firstName, lastName from Employee where " +
            "salary > (select AVG(salary) from Employee)" +
            " ORDER BY age ASC, salary DESC")
    List<Object[]> findAllEmployee();


    //Ques2 jpql
    @Modifying
    @Transactional
    @Query("update Employee e set e.salary=:salary where e.salary< (select AVG(ee.salary) from Employee ee)")
    void findAllEmployeesUpdateSalary(@Param("salary") double salary);


    //Q3 jpql
    @Modifying
    @Query("DELETE FROM Employee WHERE salary < (select AVG(salary) FROM Employee)")
    void deleteEmployees();



    //Q1 NQ
    @Query(value = "select * from employee_table where emp_last_name=:lastName", nativeQuery = true)
    List<Employee> findByLastNQ(@Param("lastName") String firstName);

    //Q2 NQ
    @Modifying
    @Query(value = "delete from employee_table where emp_age>:age", nativeQuery = true)
    void deleteEmployeeHavingAgeGreaterThan(@Param("age") int age);

}
