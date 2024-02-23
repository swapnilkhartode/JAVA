class Area
{
    float radius,result,PI;
    Area()
    {
        PI=3.14f;
    }
    void setRadius(float radius)
    {
        this.radius=radius;
    }
    float getArea()
    {
        float f = PI*radius*radius;
        return f;
    } 
}
public class default_constructor
{
    public static void main(String x[])
    {
        Area a1= new Area();
        a1.setRadius(5);
       float CircleArea= a1.getArea();
       System.out.println("The area of circle is "+CircleArea);
    }
}
