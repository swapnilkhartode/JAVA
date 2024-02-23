import java.util.*;

public class jagged1
{
    public static void main(String x[])
    {
        int a[][]=new int[][]{
                                    {1,2,3},
                                    {4,5},
                                    {7,9,8} 
        };

        int result[]=getArr(a);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]+a[i][0]);
        }

    }
    public static int [] getArr(int a[][])
    {
        return new int[]{10,20,30};
    }
}