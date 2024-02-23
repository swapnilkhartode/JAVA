

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Current Thread Name : "+Thread.currentThread().getName());
        System.out.println("run method called");
    }
}

public class CurrentThread
{
    public static void main(String x[])
    {
        MyThread t = new MyThread();
        t.start();

    }
}

/*
Current Thread Name : Thread-0
run method called
 */