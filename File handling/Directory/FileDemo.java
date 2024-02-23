import java.io.*;

public class FileDemo
{
    public static void main(String x[]) throws IOException
    {
        File f = new File("pratik");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());


    }
}