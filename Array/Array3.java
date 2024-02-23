import java.util.*;

public class Array3
{
    public static void main(String x[])
    {
          Scanner xyz= new Scanner(System.in);

          int a[]=new int[]{10,20,30,40,50};
          show(a);
          System.out.println("Display array values");
          for(int i=0;i<a.length;i++)
          {
            System.out.printf("%d\t",a[i]);
          }
          xyz.close();
    }
    public static void show(int x[])
    {
        for(int i=0;i<x.length;i++)
          {
            x[i]=x[i]+10*5;
          }
          x[2]=500;

    }

}
