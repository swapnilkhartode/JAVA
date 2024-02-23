
public class MainThread
{
    public static void main(String x[]) throws InterruptedException
    {
        Thread t = Thread.currentThread();
        String threadName=t.getName();
        System.out.println("Thread Name is "+threadName);


    }
}