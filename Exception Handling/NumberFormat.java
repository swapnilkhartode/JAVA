public class NumberFormat
{
    static int a[];
    public static void main(String x[])
    {

        try 
        {
            String s="12345 "; // NumberFormat Exception :- due to space in string
            int a=Integer.parseInt(s);
            System.out.println(a);
        } 
        catch (NumberFormatException e) {
            System.out.println("Error is "+e);
        }
    }
}