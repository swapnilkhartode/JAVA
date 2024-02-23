public class Program5
{
    public static void methodOne(int[]... x)
    {
        for(int[] a:x)
        {
            System.out.println(a[0]);
        }
    }
    public static void main(String x[])
    {
        int[] i = {10,20,30};
        int[] m = {40,50};

        methodOne(i,m);  // 10  40

    }
}