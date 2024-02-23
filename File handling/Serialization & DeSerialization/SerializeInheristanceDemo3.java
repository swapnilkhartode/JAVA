import java.io.*;

class Animal2
{
    int i=10;
    Animal2(int i)
    {
        System.out.println("Animal1 Constructor called..");
    }
}

class Cow extends Animal2 implements Serializable
{
    int j=20;
    Cow()
    {
        super(10);
        System.out.println("Cow constructor called..");
    }
}

public class SerializeInheristanceDemo3
{
    public static void main(String x[]) throws Exception
    {
        Cow d1 = new Cow();
        d1.i=888;
        d1.j=999;

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        System.out.println("Deserialization Started..");

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cow d2 = (Cow)ois.readObject();

        System.out.println(d2.i+"......"+d2.j);

        oos.close();
        ois.close();

    }
}