

class Geeks
{
    // data members of class
    String name;
    int id;

    Geeks(String name, int id)
    {
        this.name=name;
        this.id=id;
        
    }
}

class parameterize1
{
    public static void main(String x[])
    {
        Geeks G= new Geeks("Swapnil",101);
        System.out.println("Name : "+G.name + " And Id : "+G.id);

    }

}