import java.util.*;

class Student
{
    int a[];
    float Per,Avg=0;

    void setSubMarks(int s[])
    {
        a=s;
    }

    void calculatePer()
    {
        for(int i=0;i<a.length;i++)
        {
              Avg = Avg+a[i];
        }
        int len=a.length;
          this.Per= (Avg/(len*100))*100;
    }
    void CheckGrade()
    {
        if(Per >75 && Per <= 100)
        {
            System.out.println("Distinction"); 
        }
        else if(Per >60 && Per <= 75)
        {
            System.out.println("First Class"); 
        }
        else if(Per >50 && Per <= 60)
        {
            System.out.println("Second Class"); 
        }
        else if(Per >40 && Per <= 50)
        {
            System.out.println("Third Class"); 
        }
        else if(Per <40)
        {
            System.out.println("Failed"); 
        }
        else
        {
            System.out.println("Invalid Input"); 
        }
    }

}

class StudentApp
{
    public static void main(String x[])
    {
        Scanner xyz= new Scanner(System.in);

        int a[] = new int[6];

        System.out.println("Enter the Marks In array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=xyz.nextInt();
        }

        Student s= new Student();
        s.setSubMarks(a);
        s.calculatePer();
        s.CheckGrade();
        
        xyz.close();
    }
}