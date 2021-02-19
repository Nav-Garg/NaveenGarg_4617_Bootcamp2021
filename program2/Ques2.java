interface Addable{  
    int add(int a,int b);  
}  
  
public class Ques2{  
    public static void main(String[] args) {  
            
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(100,20)); 
    }  
}  
