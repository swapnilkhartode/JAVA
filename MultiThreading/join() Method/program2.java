
class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("seeta thread");
            try 
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        }
    }
}


public class program2
{
    public static void main(String x[]) 
    {
        MyThread t = new MyThread();
        t.start();
        try 
        {
            t.join(10000); // this line is executed by main thread so main thread enters into waiting state until 10000
        }
        catch(InterruptedException e)
        {}
        for(int i=0;i<10;i++)
        {
            System.out.println("Ram Thread");
        }
        


    }
}