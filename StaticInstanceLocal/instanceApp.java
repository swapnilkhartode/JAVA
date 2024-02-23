// java program to demonstrate the use of instance variable
class AB
{
    int count=0;   // will get memory each time when instance is created .
    AB()
    {
        count++;
        System.out.println(count);
    }

}
public class instanceApp
{
    public static void main(String x[])
    {
        AB a=new AB();
        AB b=new AB();
        AB c=new AB();
        

    }
}