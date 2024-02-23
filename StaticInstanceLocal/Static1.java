
class CalSet
{
    static int cube(int x)
    {
        return x*x*x;
    }
}
public class Static1
{
    public static void main(String x[])
    {
        int result=CalSet.cube(5);
        System.out.println(result);

    }
}