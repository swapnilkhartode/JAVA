import java.io.*;

class Receiver
{
    public static void main(String x[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog2 d2 = (Dog2)ois.readObject();

        System.out.println(d2.i+"........."+d2.j);

    }
}