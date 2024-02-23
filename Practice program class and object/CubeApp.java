

class Cube
{
    private int x;
    void setValue(int x)
    {
        this.x=x;
    }

    int getCube()
    {
        return x*x*x;

    }
}
public class CubeApp
{
    public static void main(String x[])
    {
        Cube c = new Cube();
        c.setValue(3);
        int result = c.getCube();
        System.out.println("Cube is "+result);

    }
}