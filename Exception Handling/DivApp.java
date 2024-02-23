class Div
{
    int a,b;

    void setValue(int x, int y)
    {
        a=x;
        b=y;
    }
    int getDiv() throws Exception
    {
        return a/b; // new ArithmeticException
    }

}

public class DivApp
{
    public static void main(String x[])
    {
        Div d=new Div();
        d.setValue(10,0);
        try {
            int result= d.getDiv();
        System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error is : "+e);
        }

    }
}