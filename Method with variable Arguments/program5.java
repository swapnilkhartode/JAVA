// WAP to find the factors which is prime number

import java.util.*;
class Factors
{
    public void PrimeFactors(int No)
    {
        for(int i=2;(i<=No/2);i++)
        {
            int iCnt=0;
            if(No%i==0)
            {
                for(int j=1;(j<=i/2);j++)
                {
                    if(i%j==0)
                    {
                        iCnt++;   
                    }      
                }
                if(iCnt==1 )
                {   
                    System.out.println(i);
                }
            }
        }
        if(No==2)
        {
            System.out.println("The prime Factors are"+No);
        }
    }
}
class program5
{    public static void main(String x[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number :");
        int iNo =sobj.nextInt();

        Factors nobj = new Factors();

        nobj.PrimeFactors(iNo);

        sobj.close();
    }
}