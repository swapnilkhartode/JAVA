import java.io.*;
public class DirectoryDemo
{
    public static void main(String x[])
    {
        File f=new File("cricket");  // directory means folder tayer honar
        System.out.println(f.exists());
        f.mkdir();          // a java file object can represent directory also.
        System.out.println(f.exists());
    }
}