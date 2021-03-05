package com.ttn.spring.springbootexercise.employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDaoService {
    private  static List<Employee> employees = new ArrayList<>();
    private static int employeeCount = 3;

    static {
        employees.add(new Employee(1, "Naveen", 24));
        employees.add(new Employee(2, "Manoj", 26));
        employees.add(new Employee(3, "Kajal", 23));
    }

    public List<Employee> findAll() {
        return employees;
    }

    public Employee save(Employee emp) {
        if (emp.getId() == null) {
            emp.setId(++employeeCount);
        }
        employees.add(emp);
        return emp;
    }

    public Employee findOne(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public Employee deleteById(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getId() == id) {
                iterator.remove();
                return emp;
            }
        }
        return null;
    }

    public void updateEmployee(Integer id, Employee emp) {
        for(int i=0; i<employees.size(); i++){
            Employee e = employees.get(i);
            if(e.getId().equals(id)){
                employees.set(i, emp);
                return;
            }
        }
    }
}
