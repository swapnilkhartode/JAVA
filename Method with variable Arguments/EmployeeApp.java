class Employee  // POJO class
{
    private int id;
    private String name;

    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }

}

public class EmployeeApp
{
    public static void main(String x[])
    {
        Employee emp = new Employee();//POJO class object
        emp.setId(1);
        emp.setName("SWAPNIL");
        String n =emp.getName();
        int i=emp.getId();

        System.out.printf("Name is %s\n",n);
        System.out.printf("Id is %d\n",i);

    
    }
}