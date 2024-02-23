
/*  1. Implicit conversion :- means those conversions perform automatically by compiler called as implicit ..
                                               means when we put the larger type of data at left hand side and smaller type of data right hand side then compiler is able to
                                            perform conversion automatically called as implicit conversion.
*/

public class ImplConvertApp
{
    public static void main(String x[])
    {
        int a=100;
        long b=a;  // implicit conversion.
        System.out.println("B = "+b);
    }
}