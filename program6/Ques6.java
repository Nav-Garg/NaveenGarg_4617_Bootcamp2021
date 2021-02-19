interface MyInterface{ 
	default void newMethod(){
        	System.out.println("Default method");  
    	}  

	static void anotherNewMethod(){
    		System.out.println("Static method");
    	}

	void Display(String str);
}
public class Ques6 implements MyInterface{
    	public void Display(String str){
        	System.out.println("String is: "+str);
    	}
    	
	public static void main(String[] args) {
    		Ques6 obj = new Ques6();
		obj.newMethod();
        	MyInterface.anotherNewMethod();
        	obj.Display("Java 8");


    }
}
