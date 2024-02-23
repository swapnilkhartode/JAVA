// Create jagged array such that first row has 1 element, second row has two elements and so on.
import java.util.*;
public class jagged2
{
    public static void main(String x[]) throws Exception
    {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=xyz.nextInt();

        int a[][]=new int [r][];   // Declaring 2-D array with r Rows

        for(int i=0;i<a.length;i++)
        {
            a[i]=new int[i+1];  // such that first row has 1 element, second row has two elements and so on.
        }

        // Initializing array

        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                  a[i][j]=count++;
            }
            
        }

        // Displaying the values of 2 D jagged array

        System.out.println("Contents of 2D jagged array");

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
