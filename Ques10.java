class BusStand
{
    synchronized public void getLine()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

class Bus extends Thread
{
    BusStand bs;
    Bus(BusStand bs)
    {
        this.bs = bs;
    }
    @Override
    public void run()
    {
        bs.getLine();
    }
}
public class Ques10 {
    public static void main(String[] args)
    {
        BusStand obj = new BusStand();

        Bus bus1 = new Bus(obj);
        Bus bus2 = new Bus(obj);
        bus1.start();
        bus2.start();
    }
}
