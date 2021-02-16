import java.lang.*;
public class ReverseAndDelete {
    public static void main(String[] args)
    {
        String str = "Naveen Garg";
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println("Reverse String: " + sbr);
	sbr.delete(4, 10);
        System.out.println("After deletion string is = " + sbr);
    }
}
