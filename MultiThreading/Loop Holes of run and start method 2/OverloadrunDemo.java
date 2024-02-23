class MyThread extends Thread
{
    public void run()
    {
        System.out.println("No-Parameter run method");
    }
    public void run(int i)
    {
        System.out.println("Int-Parameter run method");
    }

}
public class OverloadrunDemo
{
    public static void main(String x[])
    {
        MyThread t = new MyThread();
        t.start();
       

    }
}