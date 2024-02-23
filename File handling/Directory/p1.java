import java.io.*;

public class p1 
{
    public static void main(String x[]) throws IOException
    {
        File f = new File("abcd");
        f.mkdir();
        File f2 = new File(f,"zxd.txt");
        f2.createNewFile();

    }
}