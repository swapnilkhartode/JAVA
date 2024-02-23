import java.util.*;

public class Array1
{
    public static void main(String x[])
    {
          Scanner xyz= new Scanner(System.in);

          int a[]=new int[5];
          System.out.println("Enter Values in array");
          for(int i=0;i<a.length;i++)
          {
            a[i]=xyz.nextInt();
          }

          System.out.println("Display array values");
          for(int i=0;i<a.length;i++)
          {
            System.out.printf("%d\t",a[i]);
          }
          xyz.close();
    }

}
