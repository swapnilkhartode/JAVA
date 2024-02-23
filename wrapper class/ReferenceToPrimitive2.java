public class ReferenceToPrimitive2
{
    static Integer a= new Integer(100); // 100 work as a object or reference variable.
    static int b= new int(200); // invalid class type means you cannot create its object because object can create only classType and int is not class type

    public static void main(String x[])
    {
        System.out.printf("A = %d\n",a);
        System.out.printf("B = %d\n",b);
    }
}