/*
 Suppose we have classname as company with two functoins.

 voidsetEmployeeDetail(String name,int id,int sal) :this method accept three parameters .
 void show(): this method can display data of employee
 */

 class Company
 {
    private String name;
    private int id;;
    private int sal;

    public void setEmployeeDetail(String name,int id,int sal)
    {
        this.name=name;
        this.id=id;
        this.sal=sal;
    }

    void show()
    {
        System.out.printf("%s\t%d\t%d\n",name,id,sal);
    }
 }

 public class CompanyApp
 {
    public static void main(String x[])
    {
         Company c = new Company();
         c.setEmployeeDetail("ABC",1,10000);
         c.show();
    }
 }