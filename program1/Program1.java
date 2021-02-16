public class Program1 {
	public static void main(String args[]) {
		String str="Naveen Garg";
		System.out.println("Original String:   " + str );
		System.out.println("str.replace() function use:  "+ str.replace( 'N','G' ) );
		System.out.println("str.replaceFirst() function use:   "+ str.replaceFirst("a", "e") );
		System.out.println("str.replaceAll() function use:   "+ str.replaceAll("a", "y") );
	}
}
