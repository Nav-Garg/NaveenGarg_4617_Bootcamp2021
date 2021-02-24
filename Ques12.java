import java.util.concurrent.atomic.AtomicInteger;

public class Ques12 {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}
class Shared
{
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomThread implements Runnable{
    String name;
    AtomThread(String n)
    {
        name = n;
        new Thread(this).start();
    }
    public void run(){
        System.out.println("Starting "+ name);
        for(int i=0; i<=3; i++)
            System.out.println(name + " got: "+ Shared.ai.getAndSet(i));
    }
}
