package com.spring.boot.jpqlexercise;

import com.spring.boot.jpqlexercise.entities.Employee;
import com.spring.boot.jpqlexercise.repos.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpqlExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpqlExerciseApplication.class, args);
/*
		ApplicationContext context=SpringApplication.run(JpqlExerciseApplication.class, args);
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("Bill");
		emp.setLastName("Gates");
		emp.setSalary(50000.00);
		emp.setAge(35);

		Employee emp1=employeeRepository.save(emp);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+emp1);


 */
	}

}
