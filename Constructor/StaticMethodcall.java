/*
 Q. Can we call Superclass Static method from subclass in java ?
 -> Yes , by extends the superclass in the subclass
 Q.CAn we call methods of the superclass from a static method in java ?
 -> 
    yes, you can call the methosd of the superclass from static methods of the subclass ( using the object of subclass or the object of the
      superclass)
    yes , prent class is superclass method is display and public class subclass in that main method is static . we can call superclass 
    methods by creating object of subclass.
 */

class Superclass
{
    public static void display()
    {
        System.out.println("This is a Static method......");
    }
}

public class StaticMethodcall extends Superclass
{
    public static void main(String x[])
    {
        // CAlling Static method of superclass

        Superclass s =new Superclass();   // superclassobject.methodname;
        Superclass.display();         // superclassname.methodname;
        StaticMethodcall.display();  // subclassname.methodname;
        s.display();

    }
}