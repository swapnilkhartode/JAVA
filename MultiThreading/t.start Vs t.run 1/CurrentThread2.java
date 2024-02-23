class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Current Thread Name : "+Thread.currentThread().getName());
        System.out.println("run method called");
    }
}

public class CurrentThread2
{
    public static void main(String x[])
    {
        MyThread t = new MyThread();
        t.run();

    }
}
/*
Current Thread Name : main
run method called
 */