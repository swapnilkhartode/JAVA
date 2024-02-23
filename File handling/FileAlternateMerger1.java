import java.io.*;
public class FileAlternateMerger1
{
    public static void main(String x[]) throws IOException
    {
        PrintWriter pw = new PrintWriter("file9.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("file7.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("file8.txt"));

        String line1 = br1.readLine();
        String line2 = br2.readLine();

        while((line1 != null) || (line2 != null))
        {
            if(line1 != null)
            {
                pw.println(line1);
            }
            if(line2 != null)
            {
                pw.println(line2);
            }
            
            line1=br1.readLine();
            line2 = br2.readLine();
        }
        pw.flush();

        br1.close();
        br2.close();
        pw.close();
    }
}