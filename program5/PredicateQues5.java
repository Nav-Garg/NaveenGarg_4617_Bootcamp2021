import java.util.*; 
import java.util.function.Predicate;

public class PredicateQues5{
  	public static void main(String[] args) {
    		List<String> names = 
            Arrays.asList("Naveen","New","Akash","Xy","ToTheNew"); 
  
        Predicate<String> p = (s)->s.startsWith("N"); 
        for (String st:names) 
        {  
            if (p.test(st)) 
                System.out.println(st); 
        } 
  	}
}
