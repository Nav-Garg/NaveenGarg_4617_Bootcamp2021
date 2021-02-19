interface MyInterface1 
{  
    default void show() 
    { 
        System.out.println("Default MyInterface1"); 
    } 
} 
  
interface MyInterface2 
{ 
    // override show() 
    default void show() 
    { 
        System.out.println("Default MyInterface2"); 
    } 
} 
   
class Ques7 implements MyInterface1, MyInterface2 
{ 
 
    public void show() 
    { 
        MyInterface1.super.show(); 
  	MyInterface2.super.show(); 
    } 
  
    public static void main(String args[]) 
    { 
        Ques7 d = new Ques7(); 
        d.show(); 
    } 
} 
