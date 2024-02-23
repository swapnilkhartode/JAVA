import java.io.*;

public class DisplayAll
{
    public static void main(String x[]) throws NullPointerException
    {
        int count=0;
        File f= new File("C:\\Users\\Swapnil\\Desktop\\Java Full Stack Tech Hub\\BackEnd\\Java\\MultiThreading");
        String[] s=f.list();

        for(int i=0;i< s.length;i++)
        {
            System.out.println(s[i]);
            count++;
        }
        System.out.println("The total Number : "+count);
    }
}