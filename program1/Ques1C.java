interface Concatenate{
	String operate(String a,String b);
}

public class Ques1C{
	public static void main(String[] args){
		Concatenate g= (x, y)-> x.concat(y);
		System.out.println(g.operate("Naveen","Garg"));
	}
}
