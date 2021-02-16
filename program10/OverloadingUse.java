import java.util.Scanner;

public class OverloadingUse {
    public int add(int a, int b)
    {
        return a+b;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public float multiply(float a,float b)
    {
        return a*b;
    }
   public int multiply(int a, int b)
    {
        return a*b;
    }
    public void stringAdd(String a,String b)
    {
        String str = a+b;
        System.out.println("Concatenation of two Strings : "+ str);
    }
    public void stringAdd(String a,String b,String c)
    {
        String str = a+b+c;
        System.out.println("Concatenation of three Strings : "+ str);
    }
    public static void main(String[] args) {
        OverloadingUse obj = new OverloadingUse();
        Scanner sc = new Scanner(System.in);

        int result = obj.add(23,35);
        System.out.println("Addition of two integer : "+ result);

        double result2 = obj.add(234563.212,355678.32);
        System.out.println("Addition of two double : "+ result2);

        double result3 = obj.multiply(4.6f, 5.6f);
        System.out.println("Multiplication of two integer : "+ result3);

        int result4 = obj.multiply(45,20);
        System.out.println("Multiplication of two integer : "+ result4);

        obj.stringAdd("Hello ","World! ");
        obj.stringAdd("Hello ","World! ","This is Ques10");

        }
    }
