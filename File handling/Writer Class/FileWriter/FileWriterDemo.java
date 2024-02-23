import java.io.*;

public class FileWriterDemo
{
    public static void main(String x[]) throws IOException
    {
        FileWriter fw = new FileWriter("abc.txt");
        fw.write(100);
        fw.write("Swapnil\nKhartode");
        fw.write('\n');
        char []ch1={'a','b','c'};
        fw.write(ch1);
        fw.flush();
        fw.close();
    }
}