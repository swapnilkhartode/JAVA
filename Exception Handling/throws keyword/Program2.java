
public class Program2
{
    public static void main(String x[])
    {
        doStuff();// throw doesnt solve problem its only work is to give responsibility of exception handling to the caller method.
    }
    public static void doStuff() throws InterruptedException
    {
        doMoreStuff();
    }
    public static void doMoreStuff() throws InterruptedException
    {
        Thread.sleep(1000);
    }
}