import java.util.Scanner;

public class p1
{
    public static void main(String x[])
    {
        int a[]=new int[5]; //datatype variablename[] = new dataType[size];
        Scanner xyz=new Scanner(System.in);

        System.out.println("Enter the Values in Array : ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=xyz.nextInt(); // to accept integer value
        }
        System.out.println("Display Values in Array : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        xyz.close();
    }
}

