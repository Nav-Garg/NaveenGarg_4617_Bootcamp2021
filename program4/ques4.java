import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Employee {
    public int empAge;
    public String empName;
    public double empSalary;

    public Employee(int empAge, String empName, double empSalary) {
        this.empAge = empAge;
        this.empName = empName;
        this.empSalary = empSalary;
    }

}

class EmployeeSortBySalary implements Comparator < Employee > {
    public int compare(Employee emp1, Employee emp2) {
        int value = 0;
        if (emp1.empSalary > emp2.empSalary)
            value = 1;
        else if (emp1.empSalary < emp2.empSalary)
            value = -1;
        else if (emp1.empSalary == emp2.empSalary)
            value = 0;

        return value;
    }
}

public class ques4 {


    public static void main(String[] args) {
        List <Employee> employees = new ArrayList <Employee> ();
        employees.add(new Employee(22, "Dinesh", 18000));
        employees.add(new Employee(24, "Pankaj", 19000));
        employees.add(new Employee(28, "Mayur", 14000));
        employees.add(new Employee(32, "Pravin", 22000));

        System.out.println("Sort By Employee Salary");
        Collections.sort(employees, new EmployeeSortBySalary());

        printEmployees(employees);
    }

    public static void printEmployees(List <Employee> employees) {
        for (Employee e: employees) {
            System.out.println("Age:" + e.empAge + "  Name:" + e.empName + "  Salary:" + e.empSalary);
        }
    }

}

