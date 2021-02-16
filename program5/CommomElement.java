import java.io.*; 
import java.util.*; 
  
class CommomElement{  
    public static void FindCommonElements(int[] arr1, int[] arr2) 
    { 
        Set<Integer> set1 = new HashSet<Integer>(); 
        Set<Integer> set2 = new HashSet<Integer>(); 
        for (int i : arr1) 
	{ 
            set1.add(i); 
        } 
         
        for (int i : arr2) 
	{ 
            set2.add(i); 
        } 
         
        set1.retainAll(set2);  // find common elements  
        System.out.println("Common elements- " + set1); 
    } 
  
    public static void main(String[] args) 
    {  
        int[] arr1 = { 1, 2, 3, 4, 5, 2 }; 
         
        int[] arr2 = { 5, 4, 2, 1, 7, 8 }; 
        
        System.out.println("Array 1: "+ Arrays.toString(arr1)); 
        System.out.println("Array 2: "+ Arrays.toString(arr2)); 
        FindCommonElements(arr1, arr2); 
    } 
}
