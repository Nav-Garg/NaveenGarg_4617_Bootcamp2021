public class CNFound { 
      
    public static void main(String args[]) { 
        try 
        { 
            Class.forName("ExampleClass"); 
        } 
        catch (ClassNotFoundException ex) 
        { 
            ex.printStackTrace(); 
        } 
    } 
} 
