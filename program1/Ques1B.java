interface Increment {
	int calculate(int a);
}
public class Ques1B{
	public static void main(String[] args){
		int a=10;
		Increment g= (x)-> x+1;
		System.out.println(g.calculate(a));
	}
}
