import java.io.*;

public class DisplayOnlyFile
{
    public static void main(String x[])
    {
        int count=0;
        File f= new File("C:\\Users\\Swapnil\\Desktop\\Java Full Stack Tech Hub\\BackEnd\\Java\\MultiThreading");
        String[] s = f.list();

        for(String s1 : s)
        {
            File f1 = new File(f,s1);
            if(f1.isFile())
            {
                count++;
                System.out.println(s1);
            }
        }
        System.out.println("The Total Files is "+count);
    }
}