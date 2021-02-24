import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CountDownClock extends Thread {
    private String clockName;

    public CountDownClock(String clockName) {
        this.clockName = clockName;
    }

    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int i = 2; i >= 0; i--) {

            System.out.printf("%s -> %s: %d\n", threadName, clockName, i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class Ques9 {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newCachedThreadPool();

        pool.execute(new CountDownClock("A"));
        pool.execute(new CountDownClock("B"));
        pool.execute(new CountDownClock("C"));
        pool.execute(new CountDownClock("D"));

        pool.shutdown();

        ExecutorService pool1 = Executors.newFixedThreadPool(2);
        pool1.execute(new CountDownClock("A"));
        pool1.execute(new CountDownClock("B"));
        pool1.execute(new CountDownClock("C"));
        pool1.execute(new CountDownClock("D"));

        pool1.shutdown();
    }
}
