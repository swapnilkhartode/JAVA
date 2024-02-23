
public class Program3
{
    public static void main(String x[]) throws InterruptedException
    {
        doStuff();// throw doesnt solve problem its only work is to give responsibility of exception handling to the caller method.
    }
    public static void doStuff() throws InterruptedException
    {
        doMoreStuff();
    }
    public static void doMoreStuff() throws InterruptedException
    {
        Thread.sleep(6000);
        System.out.println("Hello...Swapnil");
    }
}