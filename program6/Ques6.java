import java.util.*; 
  
public class Ques6 {  
    public static void main(String[] args) 
    { 
        int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 7, 7, 5,10 }; 
  
        Map<Integer, Integer> map = new HashMap<>(); 
        List<Integer> outputArray = new ArrayList<>(); 
  
        for (int current : array) { 
            int count = map.getOrDefault(current, 0); 
            map.put(current, count + 1); 
            outputArray.add(current); 
        } 
   
        SortComparator comp = new SortComparator(map);  
        Collections.sort(outputArray, comp); 
        for (Integer i : outputArray) { 
            System.out.print(i + " "); 
        } 
	System.out.print("\n");
    } 
} 
  

class SortComparator implements Comparator<Integer> { 
    private final Map<Integer, Integer> freqMap; 
   
    SortComparator(Map<Integer, Integer> tFreqMap) 
    { 
        this.freqMap = tFreqMap; 
    } 
  
    public int compare(Integer k1, Integer k2) 
    {  
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));  
        int valueCompare = k1.compareTo(k2); 
  
     	// If frequency is equal, then just compare by value, otherwise compare by the frequency
        if (freqCompare == 0) 
            return valueCompare; 
        else
            return freqCompare; 
    } 
} 
