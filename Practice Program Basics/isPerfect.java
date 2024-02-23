import java.util.*;
public class isPerfect
{
    public static void main(String x[]) 
    {
        Scanner asd=new Scanner(System.in);
        System.out.println("Enter the Number");
        int No=asd.nextInt();
        int sum=0;
        
           for(int i=0;i<=(No/2);i++)
           {
                if(No % i == 0)
                {
                    sum=sum+i;
                }
           }
         if(sum == No)
         {
            System.out.println("The Given number is Perfect");
         }
         else
         {
            System.out.println("The Given number is Not Perfect");
         }
       
        
        asd.close();
    }
}