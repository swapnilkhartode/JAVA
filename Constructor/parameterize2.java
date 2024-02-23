import java.util.*;

class Sum
{
    int a[],s=0;

    Sum(int x[])
    {
        a=x;
    }
    int getSum()
    {
        for(int i=0;i<a.length;i++)
        {
            s = s+a[i];
        }
        return s;
    }
}

public class parameterize2
{
    public static void main(String x[])
    {
        int a[] =new int[5];

        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter five values in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=xyz.nextInt();
        }
        Sum s = new Sum(a);

        int result = s.getSum();
        System.out.println("Sum of all values is " + result);
        xyz.close();
    }
}

