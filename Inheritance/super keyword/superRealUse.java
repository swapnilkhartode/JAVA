/* Employee class inherits Person class so all the properties of Person will be inherited to Emp by default.
   To initialize all the property, we are using parent class constructor from child classes. in such way we reuse parent class constructor
 */


 class Person
 {
    int id;
    String name;

    Person(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

 }
 class Employee extends Person
 {
    float salary;
    Employee(int id,String name,Float Salary)
    {
        super(id,name); // reusing parent constructor
        this.salary=salary;
    }

    void Display()
    {
        System.out.println("id : "+id+" Name : "+name+" Salary : "+salary);
    }
 }

 public class superRealUse
 {
    public static void main(String x[])
    {
        Employee emp=new Employee(1,"Ankit",45000f);
        emp.Display();
    }
 }