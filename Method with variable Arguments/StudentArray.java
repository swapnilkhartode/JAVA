import java.util.*;
class Student
{
    private int id;
    private double per;
    private String name;

    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPer(double per)
    {
        this.per=per;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getPer()
    {
        return per;
    }

}

class StudentRecord
{
    Student s[];
    int flag=0;

    public void acceptStudentDetail(Student ...s)
    {
        this.s=s;
    }
    public void SearchStudent(int i)
    {
        
        for(int j=0;j<s.length;j++)
        {
            if(s[j].getId()==i)
            {
                System.out.println(s[j].getName()+"\t"+s[j].getPer());
                flag=1;
                if(flag==1)
                {
                    break;
                }

            }

        }

        if(flag==0)
        {
             System.out.println("Id not Found !!!");
        } 
    } 
}

public class StudentArray
{
    public static void main(String x[])
    {
        Student s[]= new Student[3];
        
        Scanner abc=new Scanner(System.in);
        for(int i=0;i<s.length;i++)
        {
            s[i]=new Student();

            Scanner xyz=new Scanner(System.in);
            System.out.println("Enter the name id and prcentage");
            String name=xyz.nextLine();
            int id=xyz.nextInt();
            double d=xyz.nextDouble();

            s[i].setName(name);
            s[i].setId(id);
            s[i].setPer(d);
        }

        StudentRecord sr=new StudentRecord();
        sr.acceptStudentDetail(s);
        System.out.println("Enter the id to search");
        int Skey=abc.nextInt();
        sr.SearchStudent(Skey);
    }
}