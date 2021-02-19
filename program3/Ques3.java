import java.util.function.BiFunction;
 
class AddSub {
    	public int add(int a, int b) {
        	return a + b;
    	}
 
    	public int sub(int a, int b) {
        	return a - b;
    	}
}

class Multiplication{
   public static int multiply(int a, int b){
	return a*b;
   }
}
public class Ques3{

    	public static void main(String[] args) {
		AddSub op = new AddSub();
 		System.out.println("\nUsing Instance Method Reference");
        	BiFunction<Integer, Integer, Integer> add2 = op::add;
        	System.out.println("Addtion = " + add2.apply(40, 5));

        	BiFunction<Integer, Integer, Integer> sub2 = op::sub;
        	System.out.println("Subtraction = " + sub2.apply(10, 56));
   
		System.out.println("\nUsing Static Method Reference");
		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
		int pr = product.apply(4, 8);
		System.out.println("Product = "+pr);
       	}
}
