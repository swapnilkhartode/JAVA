import java.util.*;

public class JaggedArray
{
    public static void main(String x[])
    {
        int a[][] = new int[][]{
                                   {1,2,3},
                                   {4,5,6},
                                   {7,8,9}
                                };
        int b[];
        b=a[1];

        for(int i=0;i<b.length;i++)
        {
            b[i]=b[i]+10;
        }

        System.out.println("Display the jagged Array");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.println();
        }

    }
}
