
// Can we call a method on "this" keyword from constructor in java.
// this.keyword in java is used as a reference to the current object.

/* 
Q. Can we call a method using this keyword from a constructor ?
-> Yes, we can call all the members of a class (methods, variables, constructors) from instance methosd or constructor.
*/  


import java.util.*;
public class CallMethodFromConstructor
{
    private String name;
    private int age;

    public CallMethodFromConstructor(String name,int age)
    {
        this.setName(name); // here we call the method from constructor
        this.setAge(age);
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void Display()
    {
        System.out.println("Name of the Student : "+name);
        System.out.println("Age Of the Student : "+age);
    }

    public static void main(String x[])
    {
        Scanner asd=new Scanner(System.in);
        System.out.println("Enter the name of student :");
        String name=asd.nextLine();
        System.out.println("Enter the Age Student :");
        int Age=asd.nextInt();
        // Calling the constructor that accepts both values 
        new CallMethodFromConstructor(name,Age).Display(); // object creation + method calling


    }
}