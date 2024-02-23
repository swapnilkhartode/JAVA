/*
 By using super() we can access non private characteristics and methods of base class.
 super keyword is only useful , if class contain inheristance in it.
 */
class Value
{
    private int no;
    Value(int x)
    {
        super(); // it calls the java.lang.object class
          no=x;
          System.out.println("I am Parameterised constructor of Parent Class");
    }

    
}
class Square1  extends Value
{
    Square1()
    {
        super(5); // child class constructor has responsibility to pass parameter to parent constructor.
        System.out.println("I am Default constructor of Child Class"); 
    }
}

public class ParaApp
{
    public static void main(String x[])
    {
        Square1 s=new Square1();

    }
}