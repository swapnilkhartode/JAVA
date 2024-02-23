import java.util.*;

public class CompareString
{
    public static void main(String x[])
    {
        Scanner asd= new Scanner(System.in);

        System.out.println("Enter First String : ");
        String str=asd.nextLine();

        System.out.println("Enter Second String : ");
        String str1=asd.nextLine();
        
        boolean areEqual=ToCompareString(str,str1);
        if(areEqual)
        {
            System.out.println("String are Equal");
        }
        else
        {
            System.out.println("String are Not Equal");
        }
        asd.close();
    }
    public static boolean ToCompareString(String s1,String s2)
    {
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        for(int i=0;i<ch1.length;i++)
        {
            if(ch1[i] != ch2[i])
            {
                return false;
            }
        }
        return true;
    }
}