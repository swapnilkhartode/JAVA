
abstract class Vehicle
{
    abstract void engine();
}
class Bike extends Vehicle
{
    void engine()
    {
        System.out.println("150 CC");
    }
}
class Car extends Vehicle
{
    void engine()
    {
        System.out.println("1000 CC");
    }
}
class VehicleApp1
{
    public static void main(String x[])
    {
        Vehicle v= new Bike();
        v.engine();
        v=new Car();
        v.engine();
    }

}