import java.util.*;

public class RemoveDuplicateCharacter
{
    public static void main(String x[])
    {
        Scanner asd=new Scanner(System.in);
        System.out.println("Enter the String Containing Digits ");
        String str=asd.nextLine();

        String s1 = removeDuplicate(str);
        
        System.out.println("String after removing duplicates "+s1);
        asd.close();

    }

    public static String removeDuplicate(String s)
    {
        char ch[]=s.toCharArray();

        int len= ch.length;

        for(int i=0;i<len;i++)
        {
            char ch1=ch[i];
            if(ch1 != '\0')
            {
                for(int j=i+1;j<len;j++)
                {
                    if(ch1 == ch[j])
                    {
                        ch[j]='\0';
                    }
                }
            }
        }
        int newIndex=0;
        for(int i=0;i<len;i++)
        {
            if(ch[i] != '\0')
            {
                ch[newIndex++]=ch[i];
            }
        }
        return new String(ch,0,newIndex);   // java.lang.String.String(char[] value, int offset, int count)
    }
}