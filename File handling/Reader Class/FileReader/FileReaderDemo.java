import java.io.*;

public class FileReaderDemo
{
    public static void main(String x[]) throws IOException
    {
        FileReader fr = new FileReader("abc.txt");
        int i = fr.read();
        while(i != -1)
        {
            System.out.print(i);
            i=fr.read();
        }

        fr.close();
    }
}