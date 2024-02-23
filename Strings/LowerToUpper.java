
import java.util.Scanner;

public class LowerToUpper
{
    public static void main(String x[])
    {
        Scanner asd= new Scanner(System.in);

        System.out.println("Enter a String in LowerCase : ");
        String str=asd.nextLine();
        String str1=convertToLowerToUpper(str);
        System.out.println("UpperCase String is : "+str1);

        asd.close();
    }
    public static String convertToLowerToUpper(String s)
    {
        char ch[] = s.toCharArray();

        for(int i=0;i< ch.length;i++)
        {
            // check if the character is lowercase
            if(ch[i]>= 'a' && ch[i]<= 'z')
            {
                ch[i]=(char)(ch[i]-32);
            }
        }
        // return ch; cannot convert from char[] to String
        return new String(ch);
    }
}