
/*
 java.lang.InterruptedException
Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity.
 Occasionally a method may wish to test whether the current thread has been interrupted, and if so, to immediately throw this exception.
  The following code can be used to achieve this effect:

 if (Thread.interrupted()) // Clears interrupted status!
     throw new InterruptedException();
 */
public class ConstructorException
{
    public ConstructorException() throws InterruptedException
    {
        System.out.println("Preparing an object");
        Thread.sleep(1000);
        System.out.println("Object is ready....");
    }
    public static void main(String x[])
    {
        try
        {
            ConstructorException ce = new ConstructorException();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}