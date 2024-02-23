/*
 b) Explicit conversion :- 
 */

 public class EmplConvertApp
 {
    public static void main(String x[])
    {
        long a=100;
       // int b=a;  // Type mismatch cannot convert from long to int.
       int b=(int)a;   // Explicit conversion
       System.out.println("B = "+b);
    }
 }

 /*
  Note : Implicit conversion and explicit conversion get failed if we try to convert primitive type value to reference type and
   reference type of value to primitive type.
  
  */