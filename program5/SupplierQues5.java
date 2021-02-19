import java.util.*;
import java.util.function.Supplier;

class SupplierQues5{
	public static void main(String[] args) {
        	int n = 10;
        	display(() -> n + 35);
        	display(() -> n + 110);
    	}

    	static void display(Supplier<Integer> arg) {
        	System.out.println(arg.get());
    	}
}
