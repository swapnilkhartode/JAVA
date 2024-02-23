

public class MyThreadApplication
{
    public static void main(String x[]) throws InterruptedException
    {
        Thread t= Thread.currentThread();
        String threadName=t.getName();
        System.out.println("Thread name is "+threadName);

    }
}