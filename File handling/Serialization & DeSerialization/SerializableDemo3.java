import java.io.*;

class Dog1 implements Serializable
{
    Cat1 c  = new Cat1();

}
class Cat1 implements Serializable
{
    Rat1 r = new Rat1();


}
class Rat1 implements Serializable
{
    int j=20;

}

public class SerializableDemo3
{
    public static void main(String x[]) throws Exception
    {
    //----------------Serialization Started......--------------------------------
        Dog1 d1 = new Dog1();
        FileOutputStream fos = new FileOutputStream("pqr.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
    //----------------Serialization Ended......--------------------------------

     //----------------DeSerialization Started......--------------------------------

        FileInputStream fis = new FileInputStream("pqr.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog1 d2 = (Dog1)ois.readObject();

    //----------------DeSerialization Ended......--------------------------------

        System.out.println(d1.c.r);// Rat1@46fbb2c1 - hashcode
        System.out.println(d1.c.r.j);// 20
         System.out.println(d2.c.r.j);// 20

        oos.close();
        ois.close();


    }
}