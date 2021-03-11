package com.spring.data.jpaexercise;

import com.spring.data.jpaexercise.entities.Employee;
import com.spring.data.jpaexercise.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
public class JpaExerciseApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Naveen");
		employee.setAge(29);
		employee.setLocation("Nodia");

		Employee employee2 = new Employee();
		employee2.setId(3);
		employee2.setName("Ankit");
		employee2.setAge(28);
		employee2.setLocation("MP");

		repository.save(employee);
		repository.save(employee2);
	}

	@Test
	public void testRead(){
		Employee employee = repository.findById(1).get();
		//assertNotNull(employee);
		//assertEqual("Ram", employee.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Name of Empolyee:"+employee.getName());
	}

	@Test
	public void testUpdate(){
		Employee employee = repository.findById(2).get();
		employee.setName("Naveen Garg");
		repository.save(employee);
	}

	@Test
	public void testDelete() {
		if (repository.existsById(1)) {
			System.out.println("Deleting a Empolyee");
			repository.deleteById(1);
		}
	}

	@Test
	public void testcount(){
		System.out.println("Total number of empolyees:==============================="+ repository.count());
	}

	@Test
	public void testFindByName(){
		List<Employee> employees = repository.findByName("Naveen Garg");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		employees.forEach(e-> System.out.println("Employee Location : "+e.getLocation()));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	@Test
	public void testFindByAgeBetween(){
		List<Employee> employees = repository.findByAgeBetween(28, 32);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Employees Name age between 28 to 32 : ");
		employees.forEach(e-> System.out.println(e.getName()));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	@Test
	public void testFindByNameLike(){
		List<Employee> employees = repository.findByNameLike("A%");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Employees Name: ");
		employees.forEach(e-> System.out.println(e.getName()));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}


	@Test
	public void testFindAllPagingAndSorting(){

		Pageable pageable = PageRequest.of(0, 3, Sort.Direction.DESC, "age");
		Page<Employee> page = repository.findAll(pageable);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Employees Name and Age: ");
		page.forEach(e-> System.out.println("Name: " + e.getName() + "      Age: "+ e.getAge()));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


	}

}





