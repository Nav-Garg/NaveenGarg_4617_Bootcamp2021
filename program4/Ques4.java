import java.util.List;

class Employee{
	private String name;
	private int age;
	private String city;

	public Employee(String name, int age, String city){
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName(){
		return name;
	}

	public void setname(String name){
		this.name = name;
	}

	public String getCity(){
                return city;
        }

        public void setCity(String city){
                this.city = city;
        }

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public String toString(){
		return "Name: " + name + "       Age: " + age + "       City: " + city;
	}
}

public class Ques4
{
	public static void main(String[] agrs){
		List<Employee>emp = List.of(
					    	new Employee("Naveen", 24, "Delhi"),
						new Employee("Raj", 30, "Mumbai"),
						new Employee("Manoj", 25, "UP"),
						new Employee("Kajal", 21, "Haryana"),
						new Employee("Shivam", 35, "MP")
					   );
		emp.stream()
			.forEach(System.out::println);
	}
}
