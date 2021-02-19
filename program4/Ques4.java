interface EmployeeSupplier{
    Employee get(String name,Integer age,String city);
}

class Employee{
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city) {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    void printEmployee(){
        System.out.println("Name: "+name+"    Age: "+age+"   City: "+city);
    }
}

public class Ques4{
    public static void main(String[] args) {
        EmployeeSupplier supplier =Employee::new;
        Employee ob=supplier.get("Naveen",24,"Delhi");
        ob.printEmployee();
    }
}
