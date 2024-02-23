
class MyThread extends Thread
{
    /*
     public final String getName()
     public final void setName(String name)
     */
    
}
public class program1
{
    public static void main(String x[])
    {
        System.out.println(Thread.currentThread().getName());
        MyThread t= new MyThread();
        System.out.println(t.getName());
        Thread.currentThread().setName("Swapnil");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.NORM_PRIORITY);

    }
}
/*
 Output :- 
      main
      Thread-0
      Swapnil
 */