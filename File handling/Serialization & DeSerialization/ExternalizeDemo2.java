/* Output :-Exception in thread "main" java.io.InvalidClassException: ExternalizeDemo2; no valid constructor    */


import java.io.*;

public class ExternalizeDemo2 implements Externalizable
{
    String s;
    int i;
    int j;

   /* public ExternalizeDemo2()
    {
        System.out.println("public no-arg Constructor");
    }
    */ 
    public ExternalizeDemo2(String s, int i, int j)
    {
        this.s=s;
        this.i=i;
        this.j=j;
    }
    public void writeExternal(ObjectOutput out) throws IOException
    {
        out.writeObject(s);
        out.writeInt(i);
    }
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {
        s = (String)in.readObject();
        i = in.readInt();
    }

    public static void main(String x[]) throws Exception
    {
        ExternalizeDemo2 t1 = new ExternalizeDemo2("durga",10,20);

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizeDemo2 t2 = (ExternalizeDemo2)ois.readObject();

        System.out.println(t2.s+"......."+t2.i+"......."+t2.j);

        oos.close();
        ois.close();



    }

    
    
    


}