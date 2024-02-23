// How do we call a java method recursively ?

public class javamethodrecursively
{
    private static long factorial(int n)
        {
            if(n==1)
            {
                return 1;
            }
            else
            {
                return n * factorial(n-1);
            }
        }
    public static void main(String x[])
    {
        javamethodrecursively obj = new javamethodrecursively();
        long result = obj.factorial(5);
        System.out.println(result);
        
    }
}