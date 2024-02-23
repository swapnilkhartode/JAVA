// Wap program to enter the two number and swap it without third variable.

class Program3
{
    public static void main(String x[])
    {
        int a,b;
        a=Integer.parseInt(x[0]);
        b=Integer.parseInt(x[1]);
        System.out.printf("Before swapping is a:%d and b:%d\n",a,b);


        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf("after swapping is a:%d and b:%d\n",a,b);

    }
}