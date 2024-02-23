

class StudentInfo
{
    int id,passYear;
    String contactNo;
    String name,collegename;
    StudentInfo(String contactNo,int passYear,String collegename)
    {
        this.contactNo=contactNo;
        this.passYear=passYear;
        this.collegename=collegename;


    }
    StudentInfo(int id, String name)
    {
        this("7620706098", 2023, "Swapnil");
        this.id=id;
        this.name=name;
    }

}
public class overloadingApp
{
    public static void main(String x[])
    {
        StudentInfo s= new StudentInfo(101,"john");
        System.out.println("Printing the information of Student ");
        System.out.println("Name : "+s.name+" id : "+s.id+" contact No : "+s.contactNo+" PassYear : "+s.passYear);

    }
}