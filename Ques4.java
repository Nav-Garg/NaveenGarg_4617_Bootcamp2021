import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ques4 {
    public static void main(String[] args) {
        try {
            testShutDown(100);
            testShutDowNow(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void testShutDown(int startNo) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.execute(getTask(i + startNo));
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
        System.out.println("shutDown - all thread shutdown");
    }

    public static void testShutDowNow(int startNo) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.execute(getTask(i + startNo));
        }
        executorService.shutdownNow();
        executorService.awaitTermination(1, TimeUnit.DAYS);
        System.out.println("shutdownNow - all thread shutdown");
    }

    public static Runnable getTask(int threadNo) {
        final Random random = new Random();
        final int no = threadNo;
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(no + " - " + random.nextInt(10));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };
        return task;
    }
}
