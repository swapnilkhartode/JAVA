import java.util.*;

public class isPallindrome
{
    public static void main(String x[])
    {
        Scanner asd=new Scanner(System.in);
        System.out.println("Enter the Number");
        int No=asd.nextInt();
        
        int rem=0,rev=0;
        int No1=No;
        while(No != 0)
        {
            rem= No %10;
            rev=(rev*10)+rem;
            No=No/10;
        }
        if(rev== No1)
        {
            System.out.println("The given number is Pallindrome");
        }
        else
        {
            System.out.println("The given number is not Pallindrome");
        }
        asd.close();
    }
}