class TryCatchFinally 
{ 
    public static void main (String[] args)  
    {  
        int[] arr = new int[4]; 
          
        try
        { 
            int i = arr[4]; 
            System.out.println("Inside try block"); 
        } 
          
        catch(ArrayIndexOutOfBoundsException ex) 
        { 
            System.out.println("ArrayIndexOutOfBoundsException "+ ex); 
        } 
        
        catch (ArithmeticException ex) 
        { 
            System.out.println("Arithmetic " + ex); 
        } 
        
	catch (NumberFormatException ex) 
        { 
            System.out.println("Number Format Exception " + ex); 
        } 
		
        finally
        { 
            System.out.println("finally block executed"); 
        } 
        System.out.println("Outside try-catch-finally clause"); 
    } 
} 
