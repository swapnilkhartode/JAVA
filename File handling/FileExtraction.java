import java.io.*;

public class FileExtraction
{
    public static void main(String x[]) throws IOException
    {
        PrintWriter pw = new PrintWriter("output.txt");

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        String line1 = br.readLine();
        while(line1 != null)
        {
            boolean available = false;
            BufferedReader br1 = new BufferedReader(new FileReader("output.txt"));
            String line2 = br1.readLine();
            while(line2 != null)
            {
                if(line1.equals(line2))
                {
                    available=true;
                    break;
                }
                line2 = br1.readLine();
            }
            if(available==false)
            {
                pw.println(line1);
            }
            line1 = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
        
    }
}

