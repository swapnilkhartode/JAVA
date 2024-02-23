import java.util.*;

class Scanners1
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);
        System.out.printf("Enter the First Value\n");
        int a=xyz.nextInt();
        System.out.printf("Enter the Second Value\n");
        int b=xyz.nextInt();
        int c=a+b;
        System.out.printf("Addition is %d\n",c);
         xyz.close();
        
    }
}