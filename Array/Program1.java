import java.util.*;

class Program1
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);

        int a[][] = new int[3][3];

        System.out.println("Enter Values in matrix");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                 a[i][j]=xyz.nextInt();
            }
        }

        System.out.println("display matrix");

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.printf("\n");
        }
    }
}