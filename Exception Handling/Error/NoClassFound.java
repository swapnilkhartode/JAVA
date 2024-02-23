class MissingClass
{
    public void displayMessage()
    {
        System.out.println("Hello From MissingClass");
    }
}
public class NoClassFound
{
    public static void main(String x[])
    {
        MissingClass missObj = new MissingClass();
        missObj.displayMessage();

    }

}