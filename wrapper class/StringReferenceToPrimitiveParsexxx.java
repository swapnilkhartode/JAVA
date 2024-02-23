
import java.util.*;
public class StringReferenceToPrimitiveParsexxx
{
    public static void main(String x[])
    {
        String s="12345";
        
// Use Parsexxx() to convert only String reference into Primitive type.
        int a=Integer.parseInt(s); // Convert String to integer
        float b=Float.parseFloat(s);// convert string to float
        double d=Double.parseDouble(s); // convert String to double

        System.out.println("A is "+a); // 12345
        System.out.println("B is "+b); // 12345.0
        System.out.println("C is "+d); // 12345.0


    }
}