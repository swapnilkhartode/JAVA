import java.util.*;

public class PrintTable
{
    public static void main(String x[])
    {
        Scanner asd=new Scanner(System.in);

        System.out.println("Enter the number which table you want to print");
        int No=asd.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d\n",No,i,No*i);
        }
        asd.close();

    }
}