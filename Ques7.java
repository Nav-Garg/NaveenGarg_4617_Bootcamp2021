
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable
{

    @Override
    public void run() {
        Random random = new Random();
        Long duration = random.nextLong();

        try {
            System.out.println("Running Thread Name : "+Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Completed Thread Name : "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Ques7 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Task());
        executorService.submit(new Task());
        executorService.submit(new Task());
        executorService.submit(new Task());
        executorService.shutdown();
        try {
            executorService.awaitTermination(10000,TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Is Executor shutdown : "+executorService.isShutdown());

    }
}
