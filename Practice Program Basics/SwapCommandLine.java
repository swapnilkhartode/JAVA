
public class SwapCommandLine
{
    public static void main(String x[])
    {
        int a= Integer.parseInt(x[0]);
        int b= Integer.parseInt(x[1]);

        System.out.println("Before Swapping is : A = "+a+"\tB = "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping is A = "+a+"\tB = "+b);
    }
}