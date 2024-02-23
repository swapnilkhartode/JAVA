
public class Program1
{
    public static void methodOne(int i)
    {
        System.out.println("general-Method");
    }
    public static void methodOne(int... i)
    {
        System.out.println("Var-arg Method");  
    }
    public static void main(String x[])
    {
        methodOne();           // Var-arg Method
        methodOne(10,20); //  Var-arg Method
        methodOne(10);       // general-Method
    }
}

// if no other method get chance then only var-arg method will get chance this is exactly same as default case inside switch case.