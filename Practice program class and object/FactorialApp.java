
class Factorial
{
    private int x;
    void setValue(int x)
    {
        this.x=x;
    }
    int getFactorial()
    {
        int iFact=1;
        for(int i=1; i<=x;i++)
        {
            iFact=iFact*i;
        }
        return iFact;
    }
}
public class FactorialApp
{
    public static void main(String x[])
    {
        Factorial f = new Factorial();
        f.setValue(4);
       int r= f.getFactorial();
       System.out.println("The Factorial is "+r);
    }
}