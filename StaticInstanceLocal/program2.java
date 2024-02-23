
class A
{
    static int y;
    int x;
}
public class program2
{
    public static void main(String x[])
    {
        A a1 = new A();
        A a2 = new A();
        a1.x=100;
        a1.y=200;

        System.out.println("With First Object ");
        System.out.println("x : "+a1.x+"   y : "+a1.y);      // Here Static variable can access using objectname.variablename;

        System.out.println("x : "+a2.x+"     y : "+a2.y);
        System.out.println(A.y);                              // Here Static variable can access using classname.variablename;

    }
}