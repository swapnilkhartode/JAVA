
public class arraybound
{
    public static void main(String x[])
{
    try {
        int a[]=new int []{10,20};
        System.out.println(a[2]); // we try to access value from index 2 which is not available in array so JVM generate exception at runtime
    } 
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error is "+e);
    }
}

}
