/*
  Note : Implicit conversion and explicit conversion get failed if we try to convert primitive type value to reference type and reference type of value to primitive type.
  
  */

public class TestConversionApp
{
    public static void main(String x[])
    {
        String s="12345";

         int b =(int)s;   //cannot cast from string to int err(compile time error)
    }
}
/* 
 it is not possible because we cannot convert direct reference variable to primitive and if we want to convert any reference variable in to primitive or vice-versa 
 then java provide some special type of clases to us called as wrapper class.
 */