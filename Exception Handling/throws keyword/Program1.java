
public class Program1
{
    public static void main(String x[])
    {
        doStuff();
    }
    public static void doStuff()
    {
        doMoreStuff(); // throw doesnt solve problem its only work is to give responsibility of exception handling to the caller method.
    }
    public static void doMoreStuff() throws InterruptedException
    {
        Thread.sleep(1000);
    }
}