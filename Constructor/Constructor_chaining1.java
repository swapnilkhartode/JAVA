// Constructor chaining using suoer() keyword.

class Base
{
    String name;

    Base()
    {
        this("Swapnil");
        System.out.println("Default constructor Base");

    }
    Base(String name)
    {
        this.name=name;
        System.out.println("Name is "+name);
    }
}

class B extends Base
{
   B()
   {
      System.out.println("Default constructor B");
   } 
   B(String name)
   {
      super(name);
      System.out.println("Parameterised constructor of B");
   }
}

class Constructor_chaining1
{
    public static void main(String x[])
    {
        B obj = new B("Khartode"); 
        B obj1 = new B(); 

    }
}