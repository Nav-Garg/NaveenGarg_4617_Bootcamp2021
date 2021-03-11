package com.spring.data.jpaexercise;

import com.spring.data.jpaexercise.entities.Employee;
import com.spring.data.jpaexercise.repos.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootApplication
public class JpaExerciseApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JpaExerciseApplication.class, args);

		//create the employee using JpaExerciseApplication class

		ApplicationContext context=SpringApplication.run(JpaExerciseApplication.class, args);
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		/*

		//Create a Employees
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Ram");
		emp.setAge(24);
		emp.setLocation("Delhi");

		Employee emp1=repository.save(emp);
		System.out.println(">>>>>>>>>>>>>>>>>"+emp1);

		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Naveen");
		employee.setAge(29);
		employee.setLocation("Nodia");

		Employee emp2=repository.save(employee);
		System.out.println(">>>>>>>>>>>>>>>>>"+emp2);

		 */

		/*
		//Update Operation
		Employee employee = repository.findById(2).get();
		employee.setName("Naveen Garg");
		Employee emp = repository.save(employee);
		System.out.println(">>>>>>>>>>>>>>>>>"+emp);

		 */

		/*
		//Delete Operation
		if (repository.existsById(1)) {
			System.out.println(">>>>>>>>>>>>Deleting a Empolyee>>>>>>>>>>>>>>");
			repository.deleteById(1);
		}

		 */

		/*
		//Read Operation
		Employee employee = repository.findById(2).get();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Name of Empolyee:"+employee.getName());

		 */

		/*
		//Count Operation
		System.out.println("Total number of empolyees:==============================="+ repository.count());

		 */

		/*
		//Pagination and Sorting
		Pageable pageable = PageRequest.of(0, 3, Sort.Direction.DESC, "age");
		Page<Employee> page = repository.findAll(pageable);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Employees Name and Age: ");
		page.forEach(e-> System.out.println("Name: " + e.getName() + "      Age: "+ e.getAge()));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		 */

		/*
		//Use finder to find Employee by Name
		List<Employee> employees = repository.findByName("Naveen Garg");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		employees.forEach(e-> System.out.println("Employee Location : "+e.getLocation()));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		 */

		/*
		//use finder to find Employees starting with A character
		List<Employee> employees = repository.findByNameLike("A%");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Employees Name: ");
		employees.forEach(e-> System.out.println(e.getName()));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		 */

		//use finder to find Employees Between the age of 28 to 32
		List<Employee> employees = repository.findByAgeBetween(28, 32);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Employees Name age between 28 to 32 : ");
		employees.forEach(e-> System.out.println(e.getName()));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
