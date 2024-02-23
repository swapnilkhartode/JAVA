import java.util.*;

class Rectangle
{
    float length,width;
    
     void setValue(float length,float width )
     {
        this.length=length;
        this.width=width;
     }
     void showArea()
     {
        System.out.println("The Area of Circle is "+ (length*width));
     }

}

class RectangleApp
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the Length and width respectively");
        float length=xyz.nextFloat();
        float width=xyz.nextFloat();

        Rectangle r = new Rectangle();
        r.setValue(length,width);
        r.showArea();
        
       xyz.close();

    }
}