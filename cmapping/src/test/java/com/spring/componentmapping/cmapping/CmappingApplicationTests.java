package com.spring.componentmapping.cmapping;

import com.spring.componentmapping.cmapping.entities.Employee;
import com.spring.componentmapping.cmapping.entities.Salary;
import com.spring.componentmapping.cmapping.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CmappingApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Employee employee = new Employee();
		employee.setId(214);
		employee.setFirstname("Naveen");
		employee.setLastname("Gag");
		employee.setAge(24);
		Salary salary1 = new Salary();
		salary1.setBasicsalary(50000);
		salary1.setBonussalary(5000);
		salary1.setTaxamount(7000);
		salary1.setSpecialallowancesalary(8000);
		employee.setSalary(salary1);

		repository.save(employee);
	}

}
