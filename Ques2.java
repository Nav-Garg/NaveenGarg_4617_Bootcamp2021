public class Ques2 extends Thread {
    @Override
    public void run() {
        for (int i=1; i<=2; i++)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Ques2 t1 = new Ques2();
        Ques2 t2 = new Ques2();
        Ques2 t3 = new Ques2();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();

    }
}
