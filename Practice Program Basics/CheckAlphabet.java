import java.util.*;
public class CheckAlphabet
{
    public static void main(String x[])
    {
        Scanner asd=new Scanner(System.in);
        char ch = asd.next().charAt(0);
        // ch=asd.next().charAt(0);

        if((ch >='A' && ch <='Z') || (ch>='a' && ch<='z'))
        {
            System.out.println("The Given Character is Alphabet");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("The Given character is Digit");
        }
        else
        {
            System.out.println("The Given character is Special Symbol");
        }

        asd.close();
    }
}