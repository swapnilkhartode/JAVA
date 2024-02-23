
class ADS
{
    private ADS(){}

    static ADS abc()
    {
        return new ADS();
    }

}
public class aaaa
{
    public static void main(String x[])
    {
        ADS a=ADS.abc();
        System.out.println(a);
    }
}