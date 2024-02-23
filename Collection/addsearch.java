

import java.util.ArrayList;
import java.util.Vector;


public class addsearch
{
    public static void main(String x[])
    {
        java.util.ArrayList<Integer> al=new java.util.ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);

        Iterator i =al.iterator();

        while(i.hasNext())
        {
            Object obj=i.next();
            System.out.println(obj);
            
        }
    }
}