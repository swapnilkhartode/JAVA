class myThread extends Thread 
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("I am Lazy Thread");
        }
        try 
        {
            System.out.println("I am entering into sleep() state");
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println("I got interrupted....");
        }
    }
}
public class ThreadInterruptDemo1
{   public static void main(String x[])
    {
        myThread t = new myThread();
        t.start();

        t.interrupt(); // in the above example interrupt() call waited until child thread completes for loop 10 times.
        System.out.println("End of Main Thread");
    }
}