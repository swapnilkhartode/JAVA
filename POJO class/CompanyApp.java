
import java.util.*;

class Employee
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
class Company
{
    private Employee e;

    public void setEmployeeDetails(Employee e)
    {
        this.e=e;
    }
    public void Show()
    {
        System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
    }


}
public class CompanyApp
{
    public static void main(String x[])
    {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Swapnil");
        emp.setSal(10000);
        Company c=new Company();
        c.setEmployeeDetails(emp);
        c.Show();

    }
}