class AB1
{
    static int count=0;   // will get memory each time when instance is created .
    AB1()
    {
        count++;
        System.out.println(count);
    }

}
class staticApp
{
    public static void main(String x[])
    {
        AB1 a=new AB1();
        AB1 b=new AB1();
        AB1 c=new AB1();
        

    }
}