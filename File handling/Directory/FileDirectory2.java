import java.io.*;

public class FileDirectory2
{
    public static void main(String x[]) throws IOException
    {
        File f1 = new File("C:\\Users\\Swapnil\\Desktop\\Java Full Stack Tech Hub\\BackEnd\\Java\\File IO\\File","xyz.txt");
        boolean b=f1.createNewFile();
        if(b)
        {
            System.out.println("File SucessFully Created!!!!!!");
        }
        else
        {
            System.out.println("Some problem is there...");
        }
    }
}