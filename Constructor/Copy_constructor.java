

class Geek
{
    String name;
    int id;

    Geek(String name, int id)  // prameterized constructor
    {
        this.name=name;
        this.id=id;
    }

    Geek(Geek obj2)
    {
        this.name=obj2.name;
        this.id=obj2.id;
    }

}

class Copy_constructor
{
    public static void main(String x[])
    {
        Geek G1 = new Geek("Swapnil",102);
        Geek G2 = new Geek(G1);
        System.out.println("Name : "+G2.name + "\tId "+G2.id);
    }
}