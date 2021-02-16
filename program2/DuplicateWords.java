public class DuplicateWords {  
    public static void main(String[] args) {  
        String string = "Naveen Garg is employee of ttn naveen good morning ttn is a IT company naveen hello naveen";  
        int count;  
        string = string.toLowerCase();    
        String words[] = string.split(" ");  
          
        System.out.println("Number of occurrences of the duplicate words in a given string : ");   
        for(int i = 0; i < words.length; i++) {  
            count = 1;  
            for(int j = i+1; j < words.length; j++) {  
                if(words[i].equals(words[j])) {  
                    count++;    
                    words[j] = "0";  
                }	
            }    
           if(count > 1 && words[i] != "0")  
             System.out.println("Word: " + words[i] + "\nNo. of occurrences is "+ count + "\n");  
        }  
    }  
}  
