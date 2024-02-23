import java.io.*;

class Sender1
{
    public static void main(String x[]) throws Exception
    {
        Dog3 d1 = new Dog3();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

    }
}