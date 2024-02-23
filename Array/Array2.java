import java.util.*;

public class Array2
{
    public static void main(String x[])
    {
          Scanner xyz= new Scanner(System.in);

          int a[]=new int[]{10,20,30,40,50};
          int b[];
          b=a;
          b[2]=200;
          
          System.out.println("Display array values");
          for(int i=0;i<a.length;i++)
          {
            System.out.printf("%d\t",a[i]);
          }
          xyz.close();
    }

}
