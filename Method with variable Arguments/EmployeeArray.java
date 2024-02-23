import java.util.*;


class Employeee  // POJO Class
{
    private int id;
    private int sal;
    private String name;

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
class Dept
{
    Employeee e[];
    void acceptEmployee(Employeee ...e)
    {
         this.e=e;
    }
    void show()
    {
        System.out.println("Display All information of Employee\n");
        for(int i=0;i<e.length;i++)
        {
               System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSal());
        }
    }
    void TotalSalary()
    {
        int sum=0;
        for(int i=0;i<e.length;i++)
        {
            sum=sum+e[i].getSal();
        }
        System.out.println("Total salary of employee is "+sum);
    }
}

public class EmployeeArray
{

    public static void main(String x[])
    {
        Employeee emp[]= new Employeee[3];  // Array of reference
        

        for(int i=0;i<emp.length;i++)
        {
            emp[i]=new Employeee();
            Scanner pqr= new Scanner(System.in);
            
            System.out.println("Enter name,  id and salary");
            String name=pqr.nextLine();
            
            int id=pqr.nextInt();
           
            int sal=pqr.nextInt();

            emp[i].setId(id);
            emp[i].setName(name);
            emp[i].setSal(sal);
        }
        Dept dp = new Dept();
        dp.acceptEmployee(emp);
        dp.show();
        dp.TotalSalary();
        
        

    }
    
}
