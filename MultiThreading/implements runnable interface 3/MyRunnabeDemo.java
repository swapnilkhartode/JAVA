
class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
            System.out.println("Current Thread is "+Thread.currentThread().getName());
        }
    }
}


public class MyRunnabeDemo
{
    public static void main(String x[])
    {
        MyRunnable t=new MyRunnable();
        Thread t1= new Thread(t);
        t1.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
            System.out.println("Current Thread is "+Thread.currentThread().getName());
        }

    }
}