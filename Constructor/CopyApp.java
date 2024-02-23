
class Copy
{
    private final String Name;
    private final int age;
    // Copy constructor
    public Copy(Copy Original)
    {
        this.Name=Original.Name;
        this.age=Original.age;
    }
    // Parameterised Constructor
    public Copy(String Name,int age)
    {
        this.Name=Name;
        this.age=age;
    }
    // getter methods for name and age
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return Name;
    }
    public void Display()
    {
        System.out.println("Name : "+Name+"   Age : "+age);
    }


}
public class CopyApp
{
    public static void main(String x[])
    {
        Copy c=new Copy("Swapnil",22);
        Copy c1=new Copy(c);
        c.Display();
        c1.Display();


    }
}