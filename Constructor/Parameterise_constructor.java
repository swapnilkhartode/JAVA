class Square
{
    private 
       int x;

    public 
      
    Square(int x)
    {
        this.x=x;
        
    }
    void getSquare()
    {
        System.out.println("The Square is "+x*x);
    }
}

class Parameterise_constructor
{
    public static void main(String x[])
    {
        Square s = new Square(10);   // new Square is object and Square(10) is responsible for object calling .
        s.getSquare();
        
    }
}