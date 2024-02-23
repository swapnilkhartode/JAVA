// If we dont know the orders of objects in serialization then SOLUTION-1 :-

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
class Rat implements Serializable
{
    int i=50;
    int j=60;

}

public class SerializableDemo2
{
    public static void main(String x[]) throws Exception
    {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Rat r1 = new Rat();

    //----------------Serialization Started......--------------------------------
        FileOutputStream fos = new FileOutputStream("khartode.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.writeObject(c1);
        oos.writeObject(r1);
    //----------------Serialization Ended......--------------------------------

    //----------------DeSerialization Started......--------------------------------
        FileInputStream fis = new FileInputStream("khartode.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        try 
        {
            while(o != null)
            {
                if(o instanceof Dog)
                {
                    Dog d2 = (Dog)o;
                    System.out.println(d2.i+"............"+d2.j);

                }
                else if(o instanceof Cat)
                {
                    Cat c2 = (Cat)o;
                    System.out.println(c2.i+"............"+c2.j);
                }
                else if(o instanceof Rat)
                {
                    Rat r2 = (Rat)o;
                    System.out.println(r2.i+"............"+r2.j);
                }
                o=ois.readObject();
            }
            
                //----------------DeSerialization Ended......--------------------------------

        }
        catch(EOFException e) //  runtime Exception
        {
            /*Signals that an end of file or end of stream has been reached unexpectedly during input.
               This exception is mainly used by data input streams to signal end of stream. Note that many other input operations 
               return a special value on end of stream rather than throwing an exception. */
            System.out.println("End of the File");
        }

        oos.close();
        ois.close();
        

    
    
    


    }
}