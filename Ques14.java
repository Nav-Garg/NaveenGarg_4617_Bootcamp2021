package com.Ques14;

class C1 extends Thread {
    public void run()
    {
        synchronized(this)
        {
            System.out.println
                    (Thread.currentThread().getName() + "  starts");
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println
                    (Thread.currentThread().getName() + " notified");
        }
    }
} class C2 extends Thread {
    C1 c1;
    C2(C1 c1)
    {
        this.c1 = c1;
    }
    public void run()
    {
        synchronized(this.c1)
        {
            System.out.println
                    (Thread.currentThread().getName() + "  starts");

            try {
                this.c1.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println
                    (Thread.currentThread().getName() + "  notified");
        }
    }
} class C3 extends Thread {
    C1 c1;
    C3(C1 c1)
    {
        this.c1 = c1;
    }
    public void run()
    {
        synchronized(this.c1)
        {
            System.out.println
                    (Thread.currentThread().getName() + "  starts");
            this.c1.notifyAll();
            System.out.println
                    (Thread.currentThread().getName() + "  notified");
        }
    }
} class Ques14 {
    public static void main(String[] args) throws InterruptedException
    {

        C1 c1 = new C1();
        C2 c2 = new C2(c1);
        C3 c3 = new C3(c1);
        Thread t1 = new Thread(c1, "Thread-1");
        Thread t2 = new Thread(c2, "Thread-2");
        Thread t3 = new Thread(c3, "Thread-3");
        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}