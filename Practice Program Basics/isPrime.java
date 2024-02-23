// Write a java program to print prime numbers from 1 to n;
import java.util.*;

public class isPrime 
{
    public static void main(String x[])
    {
        Scanner asd=new Scanner(System.in);
        System.out.println("Enter the Number upto you want to print the prime numbers");
        int No=asd.nextInt();
        int count=0;
        for(int i=2;i<=No;i++)
        {
            count=0;
            for(int j=2;j<=(i/2);j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==0 || i==2)
            {
                System.out.print(i+"\t");
            }
        }
        asd.close(); 
    }
}