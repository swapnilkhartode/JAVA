public class Program3
{
    public void methodOne(int[] i){}
    public void methodOne(int... i){}
    public static void main(String x[])
    {

    }
}
/*
Compile time error.
cannot declare both methodOne(int... i) and methodOne(int[] i) in this program
 */