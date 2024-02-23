import java.util.*;
class sum12
{
    int a[],s=0;
    sum12(int x[])
    {
        a=x;
    }
    
    int getSum()
    {
        for(int i=0;i<a.length;i++)
        {
            s=s+a[i];
        }
        return s;
    }
}
public class sumpara
{
    public static void main(String x[])
    {
        int a[]=new int[5];
        Scanner asd=new Scanner(System.in);
        System.out.println("Enter the elemets in the array ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=asd.nextInt();
        }
        sum12 s=new sum12(a);
        int result=s.getSum();
        System.out.println("Sum is : "+result);
        asd.close();


    }
}