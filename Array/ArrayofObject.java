/*
 Array of Object : it used for store multiple objects data in single name reference.
 How to create array of objects in JAVA?
 -> classname ref[]=new classname[size];// array of refernce
 for(int i=0;i<ref.length;i++)
 {
    ref[i]=new classname();    //Array of objects


    Example: Suppose we have employee class with the field id,name and salary and we want to create 5 employeeobjects and store data in it and display 
    it.
 }
 */


import java.util.*;

public class ArrayofObject
{
    public static void main(String x[])
    {
        Employee2 emp[]=new Employee2[3];  //Array of reference
        for(int i=0;i<emp.length;i++)
        {
             emp[i]=new Employee2(); // Array of objects
             Scanner sobj= new Scanner(System.in);
             System.out.println("Enter  name , id and salary of employee");
             String name=sobj.nextLine();
             int id=sobj.nextInt();
             int salary=sobj.nextInt();
             emp[i].setName(name);
             emp[i].setId(id);
             emp[i].setSal(salary);

             
        }

        System.out.println("Display the all information of Employee\n");
        for(int i=0;i<emp.length;i++)
        {
            System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+   emp[i].getSal()+"\n");
        }  
    }
}
class Employee2
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

