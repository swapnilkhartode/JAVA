//WAP to find all factors

import java.util.*;

class Numbers
{
    public void AllFactors(int iNo1)
    {
        System.out.println("All Factors are :\n");

        for(int i=1;(i<=iNo1/2);i++)
        {
            if(iNo1%i==0)
            {
                System.out.println(i+"\t");
            }
        }
    }
}

class program4
{
    public static void main(String x[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter the Number :\n");
        int iNo1 = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.AllFactors(iNo1);

        sobj.close();
    }
}