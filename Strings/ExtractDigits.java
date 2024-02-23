import java.util.*;

public class ExtractDigits
{
    public static void main(String x[])
    {
        Scanner asd=new Scanner(System.in);
        System.out.println("Enter the String Containing Digits ");
        String str=asd.nextLine();

        int sum=CalculateDigitSum(str);
        System.out.println("Sum of digits in the String : "+sum);

        asd.close();

    }

    public static int CalculateDigitSum(String s)
    {
        
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(ch >= '0' && ch <= '9')
            {
                int digitValue= ch - '0';
                sum=sum+ digitValue;
            }
        }
        return sum;
    }
}