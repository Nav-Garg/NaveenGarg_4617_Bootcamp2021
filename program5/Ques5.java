import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Student{
   public double age;
   public String fname;
   public double score;
   public Student(double age, String fname, double score) {
      this.age = age;
      this.fname = fname;
      this.score = score;
   }
}

class StudentSortByScore implements Comparator < Student > {
    public int compare(Student s1, Student s2) {
	if(s2.score>s1.score){
                        return 1;
                    }else if(s2.score<s1.score){
                        return -1;
                    }
                    return s1.fname.compareTo(s2.fname);
    }
}

public class Ques5
{
   	public static void main(String[] args){
 		List<Student> studentList = new ArrayList<Student>();
  
    	  	studentList.add(new Student(22, "Naveen", 190.5));
        	studentList.add(new Student(22, "Dinesh", 180.4));
        	studentList.add(new Student(24, "Pankaj", 190.5));
        	studentList.add(new Student(28, "Rahul", 140.0));
        	studentList.add(new Student(32, "Ankit", 175.3));
		System.out.println("Sort the Student objects based on Score , if the score are same then sort on First Name");

		Collections.sort(studentList, new StudentSortByScore());
   
  		printEmployees(studentList);
	}
  
	public static void printEmployees(List <Student> studentList) {
        	for (Student s: studentList) {
            		System.out.println("Age:" + s.age + "  Name:" + s.fname + "  Salary:" + s.score);
        	}

	}
}
