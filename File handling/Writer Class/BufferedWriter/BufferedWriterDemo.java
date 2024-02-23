import java.io.*;

public class BufferedWriterDemo
{
    public static void main(String x[]) throws IOException
    {
        FileWriter fw = new FileWriter("abc.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(100);
        bw.newLine();
        char[] ch1={'a','b','c','d'};
        bw.write(ch1);
        bw.newLine();
        bw.write("swapnil");
        //bw.write("swapnil",0,5);
        bw.newLine();;
        bw.write("Khartode");

        bw.flush();
        bw.close();
       // fw.close();


    }
}