

public class Program2
{
    public static void methodOne(int... i)
    {
        System.out.println("Var-arg method");
    }
    public static void main(String x[])
    {
        methodOne(new int[] {10,20,30});   // Var-arg method

    }
}