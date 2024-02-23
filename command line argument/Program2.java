// write a java program to enter radius of a circle and find its diameter, circumference and area
class Program2
{
    public static void main(String x[])
    {
        float r,d,c,a;
        r=Float.parseFloat(x[0]);
        d=r*r;
        System.out.printf("The diametr is : %f",d);
        c=2*3.14f*r;
        System.out.printf("Circumference  is : %f\n",c);
        a=3.14f*r*r;
        System.out.printf("The area of circle is %f\n",a);
    }
}