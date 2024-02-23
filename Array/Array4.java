import java.util.*;

public class Array4
{
    public static void main(String x[])
    {
          Scanner xyz= new Scanner(System.in);

          int a[]=new int[5];
          System.out.println("Enter values in array\n");
          for(int i=0;i<a.length;i++)
          {
            a[i]=xyz.nextInt();
          }
          int result=getMax(a);
          System.out.println("Display Max value");
          for(int i=0;i<a.length;i++)
          {
            System.out.printf("%d\t",a[i]);
          }
          xyz.close();
    }
    public static int getMax(int x[])
    {
        for(int i=0;i<x.length;i++)
          {
            x[i]=x[i]+10*5;
          }
          x[2]=500;

    }

}
