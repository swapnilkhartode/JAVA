class Sum
{
     void calSum(int ...x)
     {
        int sum=0;
        for(int i=0;i< x.length;i++)
        {
            sum = sum + x[i];
        }

        System.out.println("The Sum is "+sum);

     }
}

class SumApp
{
    public static void main(String x[])
    {
        Sum c= new Sum();
        c.calSum(10,20,30,40,50);
        c.calSum(10,20,30,40,50,60,70,80);
        c.calSum(10,20,30,40,50,60,70,80,90,100);

    }
}