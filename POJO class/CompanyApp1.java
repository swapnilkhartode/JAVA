
import java.util.*;

class Employee1
{
    private int id;
    private String name;
    private int Sal;

    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSal(int Sal)
    {
        this.Sal=Sal;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getSal()
    {
        return Sal;
    }
}
class Company1
{
    private Employee1 e[];

    public void setEmployeeDetails(Employee1 ...e)
    {
        this.e=e;
    }
    public void Show()
    {
        System.out.println("\tId :-   \tName :-   \tSalary :- ");
        for(int i=0;i<e.length;i++)
        {
            System.out.println("\t"+e[i].getId()+"\t\t"+e[i].getName()+"\t\t"+e[i].getSal());
        } 
    }


}
public class CompanyApp1
{
    public static void main(String x[])
    {
        Employee1 e1 = new Employee1();
        e1.setId(1);
        e1.setName("Swapnil");
        e1.setSal(10000);

        Employee1 e2 = new Employee1();
        e2.setId(2);
        e2.setName("Pratiksha");
        e2.setSal(20000);
        Company1 c=new Company1();
        c.setEmployeeDetails(e1,e2);
        c.Show();

    }
}