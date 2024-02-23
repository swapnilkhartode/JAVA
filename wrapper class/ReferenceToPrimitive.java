
public class ReferenceToPrimitive
{
    static Integer a; // null :- Integer is a class so variable of class is reference so by default reference is null.
    static int b; // 0

    public static void main(String x[])
    {
        System.out.printf("A = %d\n",a);
        System.out.printf("B = %d\n",b);
    }
}