import java.util.Scanner;

public class KeyboardWhile
{
        public static void main(String arg[])
        {
    		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = keyboard.next();
		while(!word.equals("done"))
		{
			if(word.charAt(0) == word.charAt(word.length() - 1))
			{
				System.out.println("First and last character are equals for the word: " + word);
			}
			else
			{
				System.out.println("First and last character are NOT equals for the word: " + word);
			}
			word = keyboard.next();
		}            
        }
}    
