import java.io.*;

class Dog implements Serializable
{
    int i=10;
    int j=20;

}
class Cat implements Serializable
{
    int i=30;
    int j=40;

}

public class SerializableDemo1
{
    public static void main(String x[]) throws Exception
    {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

    //----------------Serialization Started......--------------------------------
        FileOutputStream fos = new FileOutputStream("swapnil.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.writeObject(c1);
    //----------------Serialization Ended......--------------------------------

    //----------------DeSerialization Started......--------------------------------
        FileInputStream fis = new FileInputStream("swapnil.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cat c2 = (Cat)ois.readObject();
        Dog d2 = (Dog)ois.readObject();
        
    //----------------DeSerialization Ended......--------------------------------

    
    System.out.println(d2.i+"............"+d2.j);
    System.out.println(c2.i+"............"+c2.j);

    oos.close();
    ois.close();


    }
}