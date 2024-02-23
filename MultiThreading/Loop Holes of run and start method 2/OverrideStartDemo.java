
class MyThread1 extends Thread
{
    public void start()
    {
        System.out.println("Start Method");
    }
    public void run()
    {
        System.out.println("run Method");
    }

}


public class OverrideStartDemo
{
    public static void main(String x[])
    {
        MyThread1 t= new MyThread1();
        t.start();
        System.out.println("Main Thread");

    }
}
/*
 if we override start() method then our start() method will be executed , just like a normal method call and new thread not created, 
 because Thread class start() method not executed. and also this ovveride method not execute run() method, so in this case total output produced by 
 only main thread
 */ 