/*
 In this example :-
  MyClass : does not implement the 'Clonable' interface.
  an attempt is made to clone an instance of Myclass does not implement 'Clonable'. the clone() method throws 'CloneNotSupportedException'.
 */
class Myclass 
{

}
public class CloneNotSupported
{
    public static void main(String x[])
    {
        Myclass m = new Myclass();
        try
        {
            // attempting to clone an object that doesnt implement clonable.
            Myclass clonedem = (Myclass) m.clone();
            // Perform operations withthe cloned object
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("The error is "+e.getMessage());
            // Handle the exception
        }
    }
}

