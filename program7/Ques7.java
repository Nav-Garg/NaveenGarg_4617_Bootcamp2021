import java.util.*; 
  
class SpecialStack 
{ 
    Stack<Integer> s; 
    Integer minEle; 
   
    SpecialStack() { 
	    s = new Stack<Integer>(); 
    } 
   
    void getMin() 
    {  
        if (s.isEmpty()) 
            System.out.println("Stack is empty"); 

        else
            System.out.println("Minimum Element in the " + 
                               " stack is: " + minEle); 
    } 
   
    void peek() 
    { 
        if (s.isEmpty()) 
        { 
            System.out.println("Stack is empty "); 
            return; 
        } 
  
        Integer t = s.peek(); 
        System.out.print("Top Most Element is: "); 
  
        if (t < minEle) 
            System.out.println(minEle); 
        else
            System.out.println(t); 
    } 
  
    // Removes the top element 
    void pop() 
    { 
        if (s.isEmpty()) 
        { 
            System.out.println("Stack is empty"); 
            return; 
        } 
  
        System.out.print("Top Most Element Removed: "); 
        Integer t = s.pop(); 
  
        if (t < minEle) 
        { 
            System.out.println(minEle); 
            minEle = 2*minEle - t; 
        } 
  
        else
            System.out.println(t); 
    } 
   
    void push(Integer x) 
    { 
        if (s.isEmpty()) 
        { 
            minEle = x; 
            s.push(x); 
            System.out.println("Number Inserted: " + x); 
            return; 
        } 
   
        if (x < minEle) 
        { 
            s.push(2*x - minEle); 
            minEle = x; 
        } 
  
        else
            s.push(x); 
  
        System.out.println("Number Inserted: " + x); 
    } 
}; 
   
public class Ques7 
{ 
    public static void main(String[] args) 
    { 
        SpecialStack s = new SpecialStack(); 
        s.push(21); 
        s.push(50);
       	s.push(15);
	s.push(34);	
        s.getMin(); 
        s.push(20); 
        s.push(4); 
        s.getMin(); 
        s.pop(); 
        s.getMin(); 
        s.pop(); 
        s.peek(); 
    } 
} 
