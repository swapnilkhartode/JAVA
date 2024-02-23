class t1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("First Thread "+i+"\t"+this.isAlive()); // this method check thread is running or not, if running return true otherwise return false.

                if(i==3)
                {
                    this.stop(); // this method is used for terminate thraed or destoy thread
                }
                sleep(10000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }

}

class t2 extends Thread
{
    public void run()// This method is run by the thread when it executes. Subclasses of Thread may override this method.
    {
        try
        {
            for(int i=1;i<=50;i++)
            {
                System.out.println("Second Thread "+i);
                Thread.sleep(1000);// This method is used for hold thread execution for a specified time period.
                /*IllegalArgumentException - if the value of millis is negative
InterruptedException - if any thread has interrupted the current thread. The interrupted status of the current thread is cleared when this exception is thrown. */
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }

}

public class Mythread2
{
    public static void main(String x[]) throws InterruptedException
    {
        t1 t=new t1();
        t.start();// this method is used for start new thread or start thread and it calls run method internally.
        // means we can call start method then jvm call run() method internally means we not need to call run method manually.
        // if we try to call run() manually using thread child object then it not work as thread method.
        t.join(); // this method hold another thread execution when ever working thread not complete its execution.
        System.out.println("Now Thread status is "+t.isAlive());
        t2 s=new t2();
        s.start();
    }

}