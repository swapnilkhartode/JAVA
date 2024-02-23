
class Temp1
{
    {
        System.out.println("init block");

    }
    Temp1()
    {
        System.out.println("Default");

    }
    Temp1(int x)
    {
        System.out.println(x);
    }
}

class init_block
{
    public static void main(String x[])
    {
        new Temp1();

        new Temp1(10);
    }
}

/*
 output :
    init block
    Default
    init block
    10
 */