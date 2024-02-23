
public class PrimitiveToReference1
{
    public static void main(String x[])
    {
        int a=100;
        Integer b= Integer.valueOf(a); // convert primitive to reference 
        System.out.println("B is "+b);

        int c=12345;
        String s=String.valueOf(c);  // convert primitive to reference
        System.out.println("S is "+s);
        
        
        


    }
}