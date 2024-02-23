// Constructor chaining using this() keyword.
class Temp
{
    Temp()
    {
        this(5);

        System.out.println("The Default Constructor");
    }
    Temp(int x)
    {
        this(5,10);
        System.out.println("with one parameter "+x);

    }
    Temp(int x, int y)
    {
        System.out.println("With two parameters "+ x + "\t"+y);

    }
}
class Constructor_chaining
{
    public static void main(String x[])
    {
        Temp t=new Temp();
    }
}

// Order in constructor chaining is not important.