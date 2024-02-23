
class Thread1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("First Thread "+i);
                sleep(10000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=50;i++)
            {
                System.out.println("Second Thread "+i);
                sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
public class Mythread1
{
    public static void main(String x[])
    {
        Thread1 t1=new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();


    }
}