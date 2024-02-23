import java.io.*;

class Receiver1
{
    public static void main(String x[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog3 d2 = (Dog3)ois.readObject();

        System.out.println(d2.i+"......."+d2.j);
    }
}