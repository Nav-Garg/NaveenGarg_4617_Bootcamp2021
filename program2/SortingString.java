import java.util.Arrays; 
  
public class SortingString  
{ 
    public static String temp(String inputString) 
    {  
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 
	
    public static void main(String[] args) 
    { 
        String inputString = "naveengarg";
	char tempArray[] = inputString.toCharArray();  
        String outputString = temp(inputString);
        System.out.println("Input String : " + inputString); 
        System.out.println("Output String : " + outputString); 
    } 
} 
