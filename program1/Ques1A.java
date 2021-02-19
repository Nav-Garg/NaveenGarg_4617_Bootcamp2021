interface Greater {
	boolean isGreaterThan(int a,int b);
}

public class Ques1A{
	public static void main(String[] args) {
		int a=5,b=4;
		Greater g= (x,y)-> x>y;
		System.out.println(g.isGreaterThan(a,b));
	}
}
