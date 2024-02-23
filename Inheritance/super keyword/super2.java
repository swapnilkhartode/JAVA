class Animal1
{
    Animal1()
    {
        System.out.println("Animal is Created");
    }
}
class Dog1 extends Animal1
{
    Dog1()
    {
        super(); // if we not write super constructor then compiler implicitely super constructor internally , in the case of default constructor only
        // as we know well that default constructor is provided by compiler automatically if there is no constructor . but it al
        // also adds super() as the first statement. i
        System.out.println("Dog is Created..... ");

    }
}
public class super2
{
    public static void main(String x[])
    {
        Dog1 d= new Dog1();

    }
}