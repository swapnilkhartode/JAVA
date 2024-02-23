import java.util.*;

class jagged
{
    public static void main(String x[])
    {
        // Declaring jagged array with 3 rows
        int a[][] =new int [3][];

        a[0]=new int[3];
        a[1]=new int[4];
        a[2]=new int[2];

        Scanner xyz= new Scanner(System.in);
        System.out.println("Enter the values in matrix");
        for(int i=0;i<a.length;i++)
        {
               for(int j=0;j<a[i].length;j++)
               {
                 a[i][j]=xyz.nextInt();
               }
               
        }

        System.out.println("Display matrix Value");
        for(int i=0; i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.println();
        }



    }
}