package com.spring.boot.jpqlexercise;

import com.spring.boot.jpqlexercise.entities.Employee;
import com.spring.boot.jpqlexercise.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class JpqlExerciseApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testEmployeeCreate(){
		Employee employee = new Employee();
		//employee.setId(1);
		employee.setFirstName("Naveen");
		employee.setLastName("Garg");
		employee.setSalary(20000.00);
		employee.setAge(25);

		Employee employee2 = new Employee();
		//employee2.setId(2);
		employee2.setFirstName("Bill");
		employee2.setLastName("Gates");
		employee2.setSalary(50000.00);
		employee2.setAge(35);

		Employee emp1=repository.save(employee);
		Employee emp2 =repository.save(employee2);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+emp1);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+emp2);

		Employee employee3 = new Employee();
		//employee2.setId(2);
		employee3.setFirstName("Steven");
		employee3.setLastName(" King");
		employee3.setSalary(24000.00);
		employee3.setAge(48);

		Employee employee4 = new Employee();
		//employee2.setId(2);
		employee4.setFirstName("Neena");
		employee4.setLastName("singh");
		employee4.setSalary(7000.00);
		employee4.setAge(47);

		Employee employee5 = new Employee();
		//employee2.setId(2);
		employee5.setFirstName("Lex");
		employee5.setLastName("De Hann");
		employee5.setSalary(7000.00);
		employee5.setAge(23);

		Employee employee6 = new Employee();
		//employee2.setId(2);
		employee6.setFirstName("Raj");
		employee6.setLastName("singh");
		employee6.setSalary(30000.00);
		employee6.setAge(28);

		Employee employee7 = new Employee();
		//employee2.setId(2);
		employee7.setFirstName("Jitender");
		employee7.setLastName("Kumar");
		employee7.setSalary(70000.00);
		employee7.setAge(36);

		Employee employee8 = new Employee();
		//employee2.setId(2);
		employee8.setFirstName("Ankit");
		employee8.setLastName("Saini");
		employee8.setSalary(45000.00);
		employee8.setAge(31);

		Employee emp3=repository.save(employee3);
		Employee emp4 =repository.save(employee4);
		Employee emp5=repository.save(employee5);
		Employee emp6 =repository.save(employee6);
		Employee emp7 =repository.save(employee7);
		Employee emp8 =repository.save(employee8);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+emp3);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+emp4);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+emp5);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+emp6);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+emp7);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+emp8);
	}

	//Q1 jpql
	@Test
	public void testEmployeHavingSalaryGreaterThanAvgSal(){

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("First name, Last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary");
		List<Object[]> empData = repository.findAllEmployee();
		for(Object[] obj: empData){
			System.out.println("FirstName: "+ obj[0] + "     LastName:"+ obj[1]);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}


	//Q2 jpql
	@Test
	//@Transactional
	//@Rollback(value = false)
	public void testFindAllEmployeesUpdateSalary(){
		double salary = 11000;
		repository.findAllEmployeesUpdateSalary(salary);
	}


	//Q3 jpql
	@Test
	@Transactional
	public void testDeleteEmployees(){
		repository.deleteEmployees();
	}


	//Q1 NQ
	@Test
	@Transactional
	public void testFindByLastNameNQ(){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<Employee> employee= repository.findByLastNQ("singh");
		System.out.println(employee);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}


	//Q2 NQ
	@Test
	@Transactional
	@Rollback(value = false)
	public void testDeleteEmployeeHavingAgeGreaterThan(){

		repository.deleteEmployeeHavingAgeGreaterThan(45);
	}


}
