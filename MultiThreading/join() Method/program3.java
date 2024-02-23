
class MyThread extends Thread
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


public class program3
{
    public static void main(String x[]) 
    {
        MyThread.mt=Thread.currentThread();
        MyThread t = new MyThread();
        t.start();
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Ram Thread");
            try 
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
        


    }
}