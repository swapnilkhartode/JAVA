
class myThread1 extends Thread
{
    static Thread t2;
    public void run()
    {
        try 
        {
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread-1");
        }
    }

}

class myThread2 extends Thread
{
    public void run()
    {
        myThread1.t2=Thread.currentThread();

        for(int i=0;i<10;i++)
        {
            System.out.println("Thread-2");
        }
    }
    
}

public class TwoThreadsJoin
{
    public static void main(String x[]) throws InterruptedException
    {
        myThread2 m2=new myThread2();
        m2.start();
        myThread1 m1 =new myThread1();
        m1.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}

