
class MyThread1 extends Thread
{
    static Thread mt;
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            
            try 
            {
                mt.join();
            }
            catch(InterruptedException e){}
            System.out.println("seeta thread");
        }
    }
}


public class Deadlockprogram4
{
    public static void main(String x[]) throws InterruptedException
    {
        MyThread1.mt=Thread.currentThread();
        MyThread1 t = new MyThread1();
        t.start();

        t.join();
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Ram Thread");
            
        }
        


    }
}