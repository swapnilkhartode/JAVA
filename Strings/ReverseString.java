
import java.util.*;

public class ReverseString
{
    public static void main(String x[])
    {
        Scanner asd= new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str=asd.nextLine();
        String str1=ToReverseStrings(str);
        System.out.println("The Reverse String is : "+str1);

        asd.close();
    }
    public static String ToReverseStrings(String s)
    {
        char ch[] = s.toCharArray();
        int len=ch.length;

        for(int i=0;i<len/2;i++)
        {
            char temp=ch[i];
            ch[i]=ch[len-i-1];
            ch[len-i-1]=temp;
        }
        // return ch; cannot convert from char[] to String
        return new String(ch);
    }
}