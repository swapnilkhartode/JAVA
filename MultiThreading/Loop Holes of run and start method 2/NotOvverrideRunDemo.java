
class myThread extends Thread
{
// if class myThread does not contain start() method then Thread class run() method executes. Thread class run method has empty implementations , 
// thats why we not get any output.
}


public class NotOvverrideRunDemo
{
    public static void main(String x[])
    {
        myThread t=new myThread();
        t.start();

    }
}
// Compile and run succesfully:- No output (blank)