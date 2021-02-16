import java.io.*; 
  
class NoAndPercentage 
{ 
    public static void main(String args[]) 
    { 
        String str = "Ind:354/2, Overs:48";
       	int total_length = str.length();	
        int upper = 0, lower = 0, number = 0, special = 0; 
  
        for(int i = 0; i < str.length(); i++) 
        { 
            char ch = str.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') 
                upper++; 
            else if (ch >= 'a' && ch <= 'z') 
                lower++; 
            else if (ch >= '0' && ch <= '9') 
                number++; 
            else
                special++; 
        } 
  	
	double upperPercentage = (upper*100.0)/total_length;
	double lowerPercentage = (lower*100.0)/total_length;
	double numberPercentage = (number*100.0)/total_length;
	double specialPercentage = (special*100.0)/total_length;

        System.out.println("Number of Lower case letters : " + lower + " and  Percentage is " + lowerPercentage); 
        System.out.println("Number of Upper case letters : " + upper + "  and Percentage is " + upperPercentage); 
        System.out.println("Number of Digits : " + number + "  and Percentage is " + numberPercentage); 
        System.out.println("Number of Special characters : " + special + "  and Percentage is "+ specialPercentage); 
    } 
} 
