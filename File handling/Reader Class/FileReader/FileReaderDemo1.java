import java.io.*;

public class FileReaderDemo1
{
    public static void main(String x[]) throws IOException
    {
        File f = new File("abc.txt");
        FileReader fr = new FileReader(f);
        char[] ch = new char[(int)f.length()];

        fr.read(ch);
        for(char ch1 : ch)
        {
            System.out.print(ch1);
        }

        fr.close();
    }
}