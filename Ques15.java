import java.util.concurrent.locks.ReentrantLock;

public class Ques15 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}
class SharedClass{
    static int count = 0;
}

class LockThread implements Runnable{
    String name;
    ReentrantLock lock;
    LockThread(ReentrantLock lk, String n){
        lock = lk;
        name = n;
        new Thread(this).start();
    }
    public void run(){
        System.out.println("Starting "+ name);
        try{
            System.out.println(name+" is waiting to lock count");
            lock.lock();
            System.out.println(name+ " is locking count");
            SharedClass.count++;
            System.out.println(name + ": "+ SharedClass.count);
            System.out.println(name + " is sleeing");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }finally {
            System.out.println(name + " is unlocking count");
            lock.unlock();
        }
    }
}
