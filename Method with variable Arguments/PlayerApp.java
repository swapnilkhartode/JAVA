class Player
{
    private int id;
    private String name;
    private int run;

    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setRun(int run)
    {
        this.run=run;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getRun()
    {
        return run;
    }

}

public class PlayerApp
{
    public static void main(String x[])
    {
        Player p = new Player();
        p.setId(1);
        p.setName("Swapnil");
        p.setRun(50);
        int i=p.getId();
        String n=p.getName();
        int r=p.getRun();

        System.out.printf("Id : %d  \tName : %s  \tRun : %d\n",i,n,r);

        p.setId(2);
        p.setName("Tejas");
        p.setRun(70);

        i=p.getId();
        n=p.getName();
        r=p.getRun();

        System.out.printf("Id : %d  \tName : %s    \tRun : %d\n",i,n,r);

        p.setId(3);
        p.setName("Pratiksha");
        p.setRun(20);

        i=p.getId();
        n=p.getName();
        r=p.getRun();

        System.out.printf("Id : %d  \tName : %s  \tRun : %d\n",i,n,r);


    }
    


}