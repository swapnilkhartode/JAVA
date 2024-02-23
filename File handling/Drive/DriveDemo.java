import java.io.*;

public class DriveDemo
{
    public static void main(String x[])
    {
        int count=0;
        File f[] = File.listRoots();
        
        for(int i=0;i<f.length;i++)
        {
            long totalSpace=f[i].getTotalSpace();
            long freeSpace = f[i].getFreeSpace();
            count++;

            System.out.println(f[i]+"\t"+(totalSpace/1073741824)+"GB\t"+(freeSpace/1073741824)+"GB");
        

        }
        System.out.println(count);
    }
}