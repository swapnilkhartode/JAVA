class swap
{
    public static void main(String x[])
    {
        int a=0,b=0;
        a=Integer.parseInt(x[0]);
        b=Integer.parseInt(x[1]);
        System.out.printf("before swapping is A= %d & B=%d \n",a,b);
        a=a+b;
        b=a-b;
        a=a-b;
    
        System.out.printf("After swapping is A= %d & B=%d \n",a,b);
        
        



    }
}