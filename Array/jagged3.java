import java.util.*;

public class jagged3
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows=xyz.nextInt();

        //Declare jagged array
        int a[][]=new int[rows][];

        // alloacte memory to each row
        for(int i=0;i<a.length;i++)
        {
            System.out.printf("Enter the size of %d rows Means column in each rows  ",i);
            int rowsize = xyz.nextInt();
            a[i]=new int[rowsize];
        }

        // Initialize the elements of each sub array
         System.out.println("Enter the values in Array");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                 a[i][j]=xyz.nextInt();
            }
        }
          // Display the elements
         for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                 System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}