public class Nullpointer
{
    static int a[];
    public static void main(String x[])
    {
        try {
            
            a[0]=100;
        } catch (NullPointerException e) {
            System.out.println("Allocate memory for array");
            System.out.println("Error is "+e);
        }

    }
}