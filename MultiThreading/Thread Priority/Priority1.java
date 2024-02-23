
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Child "+Thread.currentThread().getPriority());
    }

}
public class Priority1
{
    public static void main(String x[])
    {
        System.out.println(Thread.currentThread());
        MyThread t = new MyThread();

        // main child thread janm hotanach main thread tyachi priority deto , janm jhalyavar main Thread  tyala mhanto tuza ani maza ata sambandh nahi, tula jar ky hav asel (eg. setPriority(),currentThread() ) 
        // tar tu Thread class kadun ghe. ani ajun yek mhatvach jar hyapudhe mazyat kahihi badal jhale tarihi tula khi farak padnar nhi , tuza kontahi data change honar nhi . (eg. Priority  ). jar tula change karaycha 
        // tar tu Thread Class Chya madtine tu kar.        
        Thread.currentThread().setPriority(7);
        
        t.start();
        System.out.println(t.getPriority());   
    }
}