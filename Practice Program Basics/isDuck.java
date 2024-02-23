import java.util.*;
public class isDuck
{
    public static void main(String x[])
    {
        Scanner asd=new Scanner(System.in);
        System.out.println("Enter the Number");
        int No=asd.nextInt();
        boolean flag=false;
        int rem;
        while(No != 0)
        {
            rem=No%10;
            if(rem == 0)
            {
                flag=true;
                break;
            }  
            No=No/10;
        }
        if(flag)
        {
            System.out.println("The given number is Duck");
        }
        else
        {
            System.out.println("The given number is not duck");
        }
        asd.close();
    }
}