import java.util.*;

class Employee
{
    private int id,sal;
    private String name;

    void setId(int id)
    {
        this.id=id;
    }
    int getId()
    {
        return id;
    }
    void setSal(int sal)
    {
        this.sal=sal;
    }
    int getSal()
    {
        return sal;
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }



}

public class EmployeeArrayList
{
    public static void main(String x[])
    {
        ArrayList al = new ArrayList();
        //Scanner asd=new Scanner(System.in);
        Employee Emp1=new Employee();
        Emp1.setId(1);
        Emp1.setSal(1000);
        Emp1.setName("Swapnil");

        Employee Emp2=new Employee();
        Emp2.setId(2);
        Emp2.setSal(2000);
        Emp2.setName("Twapnil");

        al.add(Emp1);
        al.add(Emp2);

        System.out.println("Display all elements");
        for(Object o : al)
        {
            System.out.println()
        }
    }
}