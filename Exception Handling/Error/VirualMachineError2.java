import java.util.ArrayList;
import java.util.List;


public class VirualMachineError2
{
    
    public static void main(String x[])
    {
        try {
            List<Object> list= new ArrayList<>();
            while(true)
            {
                list.add(new Object());
            }
        } 
        catch(OutOfMemoryError e) /*java.lang.OutOfMemoryError trown when the Java Virtual Machine cannot allocate an object because it is out of memory, 
                                  and no more memory could be made available by the garbage collector. OutOfMemoryError objects may be constructed by 
                                  the virtual machine as if suppression were disabled and/or the stack trace was not writable. */
        {
            System.out.println("Caught a VirtualMachineError : "+e.getMessage());
        }
    }
   
}