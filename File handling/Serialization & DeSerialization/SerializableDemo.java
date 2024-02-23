import java.io.*;

class Dog implements Serializable
{
    int i=10;
    int j=20;
}

public class SerializableDemo
{
    public static void main(String x[]) throws Exception  // with help of Exception we can handle multiple exceptions  at a time
    {
        Dog d1 = new Dog();

    //----------------Serialization Started......--------------------------------
        FileOutputStream fos = new FileOutputStream("mno.ser"); // if specified File not present it creates.
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
    //----------------Serialization Ended......--------------------------------

    //----------------DeSerialization Started......--------------------------------
        FileInputStream fis = new FileInputStream("mno.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject(); 
        System.out.println(d2.i+"..................."+d2.j);
    //----------------DeSerialization Ended......--------------------------------

    oos.close();
    ois.close();


    }
}