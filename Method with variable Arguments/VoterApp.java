class Voter
{
    private int id;
    private int age;
    private String name;

    public void setId(int id)
    {
        this.id=id;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getId()
    {
        return id;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
             return name;
    }

}

class VoteBank
{
    Voter v[];
    int count=0;
    void acceptVoter(Voter ...v)
    {
        this.v=v;
    }
    void showVoter()
    {
        for(int i=0;i<v.length;i++)
        {
            if(v[i].getAge()>18)
            {
                ++count;
                System.out.println(v[i].getName()+"\t"+v[i].getId()+"\t"+v[i].getAge());
            }
        }
    }
    void showFinalCount()
    {
        System.out.println("Valid count "+count);
        System.out.println("Invalid Voter "+(v.length-count));
    }
}

public class VoterApp
{
    public static void main(String x[])
    {
        Voter v1 = new Voter();
        v1.setId(1);
        v1.setName("ABC");
        v1.setAge(20);

        Voter v2 = new Voter();
        v2.setId(2);
        v2.setName("MNO");
        v2.setAge(10);

        Voter v3 = new Voter();
        v3.setId(3);
        v3.setName("PQR");
        v3.setAge(25);

        VoteBank vb = new VoteBank();
        vb.acceptVoter(v1,v2,v3);
        vb.showVoter();
        vb.showFinalCount();
    }
}