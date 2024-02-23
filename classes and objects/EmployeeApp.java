import java.util.*;
class Employee
{
    String name;
    int id,Progress;
    float basicSal;
    float TotalSalary=basicSal;

    void setPersonalInfo(String name, int id, float basicSal)
    {
        this.name=name;
        this.id=id;
        this.basicSal=basicSal;
    }
    void setProgressPer(int Progress)
    {
        if(Progress > 60)
        {
             this.TotalSalary= basicSal + (0.3f)*basicSal;
        }
        else
        {
            this.TotalSalary= basicSal;
        }
    }
    void show()
    {
        
        if(TotalSalary > basicSal)
        {
            System.out.println("Name : "+name + "  Basic Salary : "+ basicSal + "   TotalSalary is : "+TotalSalary);
            System.out.println("Incremented Salary : "+(TotalSalary-basicSal));
        }
        else
        {
                 System.out.println("Name : "+name + "  Basic Salary : "+ basicSal + "   TotalSalary is : "+TotalSalary);
                 System.out.println("Salary is not Incremented!!!");
        }

    }


}

class EmployeeApp
{
    public static void main(String x[])
    {
        Scanner xyz= new Scanner(System.in);
        System.out.println("Enter the Name , id and Basic Salary respecyively");
        String name=xyz.nextLine();
        int id=xyz.nextInt();
        float BasicSal=xyz.nextFloat();

        System.out.println("Enter the Progress in Percentage");
        int Progress=xyz.nextInt();

        Employee E = new Employee();
        E.setPersonalInfo(name,id,BasicSal);
        E.setProgressPer(Progress);
        E.show();
        
        xyz.close();
    }
}