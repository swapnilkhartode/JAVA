
class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
            Thread.yield();
            // public static native void yield()
        }
    }

}
public class YieldDemo
{
    public static void main(String x[])
    {
        MyThread t = new MyThread();
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("main Thread");
        }

    }
}