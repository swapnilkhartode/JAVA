class MyThread extends Thread 
{
    public void run()
    {
        try 
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("I am Lazy Thread");
                Thread.sleep(2000); // we can interrupt sleeping thread or waiting thread by using interrupt method of thread class.
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("I got Interrupted");
        }
    }
}
public class ThreadInterruptDemo
{   public static void main(String x[])
    {
        MyThread t = new MyThread();
        t.start();

        t.interrupt();// interrupt call is like snake, it find the chance to bite target.
        System.out.println("End of the main");
    }
}

// if the target thread entered into sleeping or waiting state then immidiately interrupt call will interrupt the target Thread.

/* i] if the target thread never entered into sleeping or waiting state in its lifetime then there is no impact of interrupt call , this is the 
      only case where interrupt call be wasted.
  ii] the interrupt target is to interrupt under that respective thread should be killed , but assume Thread got died in some accident before interrupt() call
      invoked , then What will happen ? -> in that call interrupt() call will be wasted.

*/