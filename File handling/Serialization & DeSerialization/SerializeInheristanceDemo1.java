import java.io.*;

class Animal 
{
    int i=10;

}
class Monkey extends Animal implements Serializable
{
    int j=20;
}
public class SerializeInheristanceDemo1
{
    public static void main(String x[]) throws Exception
    {
        Monkey d1 = new Monkey();
        System.out.println(d1.i+"......"+d1.j);
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Monkey d2 = (Monkey)ois.readObject();

        System.out.println(d2.i+"......."+d2.j);

        oos.close();
        ois.close();

    }
}