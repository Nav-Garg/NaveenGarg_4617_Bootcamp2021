class FindSingleElement 
{   
    public static void main (String[] args) 
    { 
        int ar[] = {2, 3, 1, 4, 1, 3, 4}; 
        int n = ar.length;
       	int val = ar[0];
        for (int i = 1; i < n; i++)
            val = val ^ ar[i]; 	
        System.out.println("Element occurring once is " + val); 
    } 
} 
