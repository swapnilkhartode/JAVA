
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


public class program1
{
    public static void main(String x[]) 
    {
        MyThread t = new MyThread();
        t.start();
        try 
        {
            t.join(); // this line is executed by main thread so main thread enters into waiting state until child thread completion
        }
        catch(InterruptedException e)
        {}
        for(int i=0;i<10;i++)
        {
            System.out.println("Ram Thread");
        }
        


    }
}