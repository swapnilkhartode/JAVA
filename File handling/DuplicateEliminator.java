// Write a java program to remove duplicates from the given input file.

import java.io.*;

public class DuplicateEliminator
{
    public static void main(String x[]) throws IOException
    {
        PrintWriter pw = new PrintWriter("Uniqueoutput.txt");

        BufferedReader br = new BufferedReader(new FileReader("input1.txt"));

        String line1 = br.readLine();
        while(line1 != null)
        {
            boolean available = false;
            BufferedReader br1 = new BufferedReader(new FileReader("Uniqueoutput.txt"));
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
                pw.flush();
            }
            line1 = br.readLine();
        }
        
        br.close();
        pw.close();
        
    }
}



