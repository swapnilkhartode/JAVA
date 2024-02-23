import java.io.*;

class Account1 implements Serializable
{
    String userName = "durga";
    transient String pwd = "anushka";
    transient int pin = 1234;

    private void writeObject(ObjectOutputStream os) throws Exception
    {
        os.defaultWriteObject();
        String epwd = "123"+pwd;
        os.writeObject(epwd);
        int epin = 4444 + pin;
        os.writeInt(epin);

    }
    private void readObject(ObjectInputStream is) throws Exception
    {
        is.defaultReadObject();
        String epwd = (String)is.readObject();
        pwd = epwd.substring(3);
        int epin = is.readInt();
        pin = epin - 4444;
    }

}

public class CustSerializeDemo2
{
    public static void main(String x[]) throws Exception
    {
        Account1 a1 = new Account1();
        System.out.println(a1.userName+"......."+a1.pwd+"......."+a1.pin);
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account1 a2 = (Account1)ois.readObject();

        System.out.println(a2.userName+"......."+a2.pwd+"......."+a2.pin);

        oos.close();
        ois.close();


    }
}


