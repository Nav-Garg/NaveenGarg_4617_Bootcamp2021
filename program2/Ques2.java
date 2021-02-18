import java.util.*;

public class Ques2 {
	public static int uniqueChar(String s1){
		StringBuffer sb = new StringBuffer(s1);
    		for (int i = 0; i < sb.length(); i++) {
      			int count = 0;
      			for (int j = i + 1; j < sb.length(); j++) {
        			if (sb.charAt(i) == sb.charAt(j)) {
          				sb.deleteCharAt(j);
          				j--;
          				count++;
        			}
      			}
      			if (count >= 1) {
        			sb.deleteCharAt(i);
        			i--;
      			}
    		}
		int val = sb.length();
    	return val;
	}
  	
	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
    		String str = sc.nextLine();
 	   	int v = uniqueChar(str);
		System.out.println("Number of unique characters in the string: "+ v);
	}
}
