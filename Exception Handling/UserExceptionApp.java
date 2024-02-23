

// class representing custom exception
class VoterException extends ArithmeticException
{
    public String getVoteError()
    {
        return "Invalid Voter because below 18";
    }
}
class VotingMachine
{
    void verifyvoter(int age)
    {
        if(age<18)
        {
            VoterException ve=new VoterException();
            // throw an object of user defined exceptions
            throw ve;
        }
        else
        {
            System.out.println("Valid Voter");
        }
    }
} 
public class UserExceptionApp
{
    public static void main(String x[])
    {
        VotingMachine vm=new VotingMachine();
        try {
                 // calling the method
            vm.verifyvoter(10);
            
        } catch (VoterException e) {
            //printing the exception
            System.out.println(e.getVoteError());
        }
    }
}
