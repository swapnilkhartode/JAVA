import java.io.*;

public class PrintWriterDemo2
{
    public static void main(String x[]) throws IOException
    {
        //FileWriter fw = new FileWriter("abc.txt");
        PrintWriter pw = new PrintWriter("xyz.txt");

        //pw.write(100);
        pw.println(100);
        pw.println(true);
        pw.println('c');
        pw.println("durga");
        pw.flush();
        pw.close();
    }
}