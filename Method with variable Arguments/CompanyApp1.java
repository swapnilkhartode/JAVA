class Employee1  // POJO class
{
    private int id;
    private String name;
    private int sal;

    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSal(int sal)
    {
        this.sal=sal;
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
        return sal;
    }

}

class Company1
{
    private Employee1 employee;

    void setEmployeeDetail(Employee1 employee)
    {
        this.employee=employee;
    }

    void show()
    {
        System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSal());
    }
}
public class CompanyApp1
{
    public static void main(String x[])
    {
        Company1 c = new Company1();
        Employee1 e = new Employee1();
        e.setId(1);
        e.setName("SWAPNIL");
        e.setSal(10000);
        c.setEmployeeDetail(e);
        c.show();
    
    }
}