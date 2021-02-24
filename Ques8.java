import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ques8 {
    public static void main(String[] args) {
        ScheduledExecutorService ser = Executors.newScheduledThreadPool(4);
        ser.schedule(new RunClass(), 2, TimeUnit.SECONDS);
        ser.scheduleAtFixedRate(new RunClass(),2, 5, TimeUnit.SECONDS);
        ser.scheduleWithFixedDelay(new RunClass(),2, 3, TimeUnit.SECONDS);
    }
}
class RunClass implements Runnable
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "   Reading  "+ System.currentTimeMillis() + "  milliseconds");
    }
}
