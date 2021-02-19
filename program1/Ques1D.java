interface UpperCase {
	String operate(String a);
}
public class Ques1D{
	public static void main(String[] args){
		UpperCase g= (x)-> x.toUpperCase();
		System.out.println(g.operate("naveengarg"));
	}
}
