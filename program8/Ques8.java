interface ABC{
	default void abc(){
		System.out.println("default abc method");
	}
 
	default void print(){
		System.out.println("default print abc method");
	}
}
 
interface XYZ{
	default void xyz(){
		System.out.println("default xyz method");
	}
 
	default void print(){
		System.out.println("default print xyz method");
	}
}
 
public class Ques8 implements ABC, XYZ {
 
	public void print(){
		ABC.super.print();
		XYZ.super.print();
	}
 
	public static void main(String[] args) {
		Ques8 obj = new Ques8();
		obj.abc();
		obj.xyz();
		obj.print();
	}
}
