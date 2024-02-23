public class VirtualMachineError
{
    static int counter;
    public static void main(String x[])
    {
        try {
            recursiveMethod(counter);
        } 
        catch(StackOverflowError e) /*java.lang.StackOverflowError :- Thrown when a stack overflow occurs because an application recurses too deeply. */
        {
            System.out.println("Error name is : "+e.getClass().getSimpleName());
            System.out.println("Caught a VirtualMachineError : "+e.getMessage());
        }
    }
    public static void recursiveMethod(int r)
    {
        
        System.out.println("Counter : "+r);
        recursiveMethod(counter++);
    }
}