
class MyThread2 extends Thread
{
    public void start()
    {
        super.start();
        System.out.println("Start() method");
        System.out.println("Inside overided start method "+currentThread().getName());
    }
    public void run()
    {
        System.out.println("run method");
        System.out.println("Inside overided run method "+currentThread().getName());
    }

}

public class OverrideStartDemo1
{
    public static void main(String x[])
    {
        MyThread2 t = new MyThread2();
        t.start();

    }
}