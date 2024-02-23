// Wap java program to enter two numbers and performs all arithmetic operations.



class Program1
{
    public static void main(String x[])
    {
        int a=0,b=0,c=0;
        a=Integer.parseInt(x[0]);
        b=Integer.parseInt(x[1]);
        c=a+b;
        System.out.printf("Sum of two numbers is : %d\n",c);
        c=a-b;
        System.out.printf("Substraction of two numbers is %d\n",c);
        c=a*b;
        System.out.printf("Multiplication of two numbers is %d\n",c);
        c=a/b;
        System.out.printf("Division of two numbers is %d\n",c);



    }
}