import java.io.*;

class Sender
{
    public static void main(String x[]) throws Exception
    {
        Dog2 d1 = new Dog2();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
    }
}