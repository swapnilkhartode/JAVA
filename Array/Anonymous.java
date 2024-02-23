class Test
{
    public static void main(String x[]) throws ClassNotFoundException
    {
        // Anonymous array
        sum(new int []{1,2,3,4});
    }
    public static void sum(int []a) throws ClassNotFoundException
    {
        int total=0;

        for(int i=0;i<a.length;i++)
        {
            total+=i;
        }
        System.out.println("The sum is : "+total);

    }
}