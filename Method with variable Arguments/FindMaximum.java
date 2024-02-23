
class FindMax
{
    int MaxNumber(int ...x)
    {
        int iMax=0;
        for(int i=0;i<x.length;i++)
        {
           if(iMax < x[i])
           {
              iMax=x[i];
           }
        }
        return iMax;
    }
}
public class FindMaximum
{
    public static void main(String x[])
    {
        FindMax fm = new FindMax();
        int result = fm.MaxNumber(10,20,30,40,80);
        System.out.println("The maximum number is : "+result);
    }
}