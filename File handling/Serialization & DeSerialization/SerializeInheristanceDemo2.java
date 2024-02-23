import java.io.*;

class Animal1 
{
    int i=10;
    Animal1()
    {
        System.out.println("Animal1 Constructor called..");
    }
}

class Tiger extends Animal1 implements Serializable
{
    int j=20;
    Tiger()
    {
        System.out.println("Tiger constructor called..");
    }
}

public class SerializeInheristanceDemo2
{
    public static void main(String x[]) throws Exception
    {
        Tiger d1 = new Tiger();
        d1.i=888;
        d1.j=999;

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        System.out.println("Deserialization Started..");

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Tiger d2 = (Tiger)ois.readObject();

        System.out.println(d2.i+"......"+d2.j);

        oos.close();
        ois.close();

    }
}