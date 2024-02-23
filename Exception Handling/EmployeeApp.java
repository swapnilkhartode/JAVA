class EmployeeException extends ArithmeticException
{
    public String getError()
    {
        return "Employee is not Permanent";
    }
}

class EmployeeMachine
{
    void verifyEmployee(int salary)
    {
       if(salary < 25000)
       {
           EmployeeException ee = new EmployeeException();
           throw ee;
       }
       else
       {
         System.out.println("Employee is Permanent");
       }
    }
    

}

public class EmployeeApp
{
    public static void main(String x[])
    {

        EmployeeMachine em = new EmployeeMachine();

        try {
            em.verifyEmployee(2000);
        } catch (EmployeeException e) {
            System.out.println("Error is : "+e.getError());
        }


    }
}