import java.util.*;

public class ReferenceToPrimitive3
{
    public static void main(String x[])
    {
        Double d=5.4;  // d is reference
        int b=d.intValue(); // convert double reference variable in to integer primitive type
        long e=d.longValue(); // convert double reference variable in to long type
        short s = d.shortValue(); // convert double reference variable in to short type
        float f = d.floatValue(); // convert double reference variable in to float type.
        byte bc=d.byteValue();
        double db=d.doubleValue();
        System.out.println("Integer B is : "+b);
        System.out.println("Long e is : "+e);
        System.out.println("Short s is : "+s);
        System.out.println("Float f is : "+f);//5.4
        System.out.println("Byte bc is : "+bc);
        System.out.println("Double bd is : "+db); //5.4
        System.out.println(sizeOf(s));
    }
}