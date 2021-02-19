import java.util.*;
import java.util.function.Function;

class FuctionQues5 {
  	public static void main(String[] args) {
    		int n = 5;
    		modifyValue(n, val-> val + 10);
    		modifyValue(n, val-> val * 100);
  	}

  	public static void modifyValue(int v, Function<Integer, Integer> function){
    		int result = function.apply(v);
    		System.out.println(result);
  	}
}
