/*
 is a checked exception in java that occurs when a thread is interrupted while it in a blocked, waiting or sleeping state.
 */

 public class InterruptedException
 {
    public static void main(String x[])
    {
        Thread myThread = new Thread();
        try {
            for(int i=0;i<5;i++)
            {
                System.out.println("Running..."+i);
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Thread Interrupted : "+e.getMessage());
        }

        myThread.start();// Start the Method

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted "+e);
        }

        myThread.interrupt();
    }
    

 }
