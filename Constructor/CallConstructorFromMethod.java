
/*
 construtor generally used to initialize the instance variables of class.
 There is no need to invoke constructor explicitely these are automatically invoked at the time of object creation.

 if you need to invoke a constuctor explicitely you can do so , using this().

 Q. can we invoke constuctor from method ?
 -> No, you cannot call a constructor froma method. you can invoke constructor using this() or super() explicitely , 
    but we must write this and super in constuctor. if you invoke constuctor explicitely elsewhere , a compile time error will be 
    generated
 */
import java.util.*;


 class Student
{
    private String name;
    private int age;

    public Student(String name,int age)
    {
        this.name=name; 
        this.age=age;

    }
    Student(){}

    public void setValues(String name,int Age)
    {
        this(name,Age);
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
        int age=asd.nextInt();

        Student obj = new Student();
        obj.setValues(name,age);
        obj.Display();


        

    }
}