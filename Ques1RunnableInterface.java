class Multi3 implements Runnable {
    public void run() {
        System.out.println("Runnable Interface is running...");
    }
}
public class Ques1RunnableInterface {
        public static void main(String[] args) {
            Multi3 m1=new Multi3();
            Thread t1 =new Thread(m1);
            t1.start();
        }
}
