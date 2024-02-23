

import java.util.*;

class Employee
{
    int id;
    String name;
    void setValue(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
class FreeLancer extends Employee
{
    //super.id=
    void printInfo()
    {
        System.out.println("The id : "+id+"  name : "+name);
    }
}
class ContractEmployee extends Employee
{
    void printInfo()
    {
        System.out.println("The id : "+id+"  name : "+name);
    }

}
class PermenentEmployee extends Employee
{
    void printInfo()
    {
        System.out.println("The id : "+id+"  name : "+name);
    }

}

public class Reusability
{
    public static void main(String x[])
    {
        PermenentEmployee p=new PermenentEmployee();
        p.setValue(1, "Swapnil");
        p.printInfo();

        FreeLancer f=new FreeLancer();
        f.setValue(2, "Tejas");
        f.printInfo();

        ContractEmployee c = new ContractEmployee();
        c.setValue(3, "Pratiksha");
        c.printInfo();
    }

}