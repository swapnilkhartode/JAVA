class Student
{
    int rollno;
    String name;
    static String college="VPKBIET";    // static variable

    Student(int r, String n)
    {
        rollno=r;
        name=n;
    }

    void Display()
    {
        System.out.println("Rollno : "+rollno+" name : "+name+" college : "+college);
    }
    static void change()
    {
        college="SHVK";
        name="Swapnil";  // static members can only acess static data members
            
    }

}

public class CollegeApp
{
    public static void main(String x[])
    {
        Student s1= new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");
        s1.Display();
        s2.Display();

        // we can change the college of all objects
        // Student.college="VPASC";
        
    }
}