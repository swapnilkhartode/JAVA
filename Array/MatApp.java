
import java.util.*;

public class MatApp
{
    public static void main(String x[])
    {
        Scanner asd=new Scanner(System.in);

        int a[][] = new int[3][3];
        System.out.println("Enter the Values in Array : ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j] = asd.nextInt();
            } 
        }
        System.out.println("Display Matrix ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.printf("%d\t",a[i][j]);
            } 
            System.out.println();
        }
        asd.close();
    }
}