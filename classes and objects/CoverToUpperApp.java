import java.util.*;

class CoverToUpper
{
    char c[];

    void setCharArray(char ch[])
    {
        c=ch;
    }
    void CoverToUpperCase()
    {
        for(int i=0;i<c.length;i++)
        {
            if(c[i] >= 'a' && c[i] <= 'z')
            {
                  c[i]= (char) ((int) c[i]-32);
            }
            
        }

        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]);
        }
    }

}

class CoverToUpperApp
{
    public static void main(String x[])
    {    Scanner xyz=new Scanner(System.in);
        
        CoverToUpper c = new CoverToUpper();
        System.out.println("Enter the string");
        String s1 = xyz.nextLine();

        
        char ch[]= new char[s1.length()];

        ch=s1.toCharArray();
        c.setCharArray(ch);
        c.CoverToUpperCase();
        
        
       
        

        c.setCharArray(ch);

        xyz.close();

    }
}