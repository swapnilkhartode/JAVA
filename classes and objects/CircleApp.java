import java.util.*;

class Circle
{
    float radius,PI;
    Circle()
    {
        PI=3.14f;
    }
     void setRadius(float radius)
     {
        this.radius=radius;
     }
     void showArea()
     {
        System.out.println("The area of Circle is "+ (PI*radius*radius));
     }

}

class CircleApp
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the Radius");
        float radius=xyz.nextFloat();

        Circle c = new Circle();
        c.setRadius(radius);
        c.showArea();

        xyz.close();
    }
}