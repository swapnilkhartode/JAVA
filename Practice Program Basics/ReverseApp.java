import java.util.*;

public class ReverseApp
{
    public static void main(String x[])
    {
        Scanner asd=new Scanner(System.in);
        System.out.println("Enter the Number");
        int No = asd.nextInt();
        int rem=0,rev=0;

        System.out.println("Number before Reverse is : "+No);
        while(No != 0)
        {
            rem=No%10;
            rev = (rev*10)+rem;
            No = No/10;   
        }
        System.out.println("Number After Reverse is : "+rev);
        asd.close();
    }
}