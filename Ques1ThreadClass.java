class Multi extends Thread {
    public void run() {
        System.out.println("Thread Class is running ...");
    }
}
    public class Ques1ThreadClass {
        public static void main(String[] args) {
            Multi t1=new Multi();
            t1.start();
        }
}
