import java.io.*;

class Account implements Serializable 
{
    String userName = "Durga";
    String PassWd = "Anushka";

    private void writeObject(ObjectOutputStream os) throws Exception 
    {
        os.defaultWriteObject();
        /* void java.io.ObjectOutputStream.defaultWriteObject() throws IOException
           Write the non-static and non-transient fields of the current class to this stream. 
           This may only be called from the writeObject method of the class being serialized. 
           It will throw the NotActiveException if it is called otherwise.
           Prototype : public void defaultWriteObject();
 */
        String epwd = "123"+PassWd;
        os.writeObject(epwd);


    }
    private void readObject(ObjectInputStream is) throws Exception 
    {
        is.defaultReadObject();
        /* oid java.io.ObjectInputStream.defaultReadObject() throws IOException, ClassNotFoundException
           Read the non-static and non-transient fields of the current class from this stream.
            This may only be called from the readObject method of the class being deserialized. 
            It will throw the NotActiveException if it is called otherwise. */
        String epwd=(String)is.readObject();
        PassWd = epwd.substring(3);

    }

}

public class CustSerializeDemo1
{
    public static void main(String x[]) throws Exception
    {
        Account a1 = new Account();
        System.out.println(a1.userName+"......"+a1.PassWd);

        FileOutputStream fos = new FileOutputStream("rst.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1); // trying to serialize account object a1 with help of this line

        FileInputStream fis = new FileInputStream("rst.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a2 = (Account)ois.readObject();

        System.out.println(a2.userName+"......"+a2.PassWd);

        oos.close();
        ois.close();


    }
}

/* Durga......Anushka
   Durga......Anushka */