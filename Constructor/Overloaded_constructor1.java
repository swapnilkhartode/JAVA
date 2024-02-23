class Sum1
{
    
    Sum1(int x, int y)
    {
        System.out.println("The Addition of 2 integrs is "+ (x+y));
    }
    Sum1(float x, float y)
    {
        System.out.println("The Addition of 2 floats is "+(x+y));
    }
}

class Overloaded_constructor
{
    public static void main(String x[])
    {
        Sum1 s1 = new Sum1(5,4);
        Sum1 s2 = new Sum1(12.5f,10.5f); // when we use to refernces name same then it gets compile time error (Duplicate local variable)
    }
}