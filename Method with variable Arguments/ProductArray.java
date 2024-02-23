/*
 Wap program create class name as Product with field id ,name and price and create array of object of size 5 and
  arrange all products in descending ordre by price.
 */

 import java.util.*;

 class Products
 {
    private int id;
    private String name;
    private int price;

    public void setId(int id)
    {
         this.id=id;
    }
    public void setName(String name)
    {
          this.name=name;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }
 }
 public class ProductArray
 {
    public static void main(String x[])
    {
        Products p[]=new Products[3];// Array of refernce
        
        for(int i=0;i<p.length;i++)
        {
            p[i]=new Products();  // array of objects
            Scanner xyz = new Scanner(System.in);
           
            System.out.println("Enter name, id and price");
            String name=xyz.nextLine();
            int id=xyz.nextInt();
            int price=xyz.nextInt();

            p[i].setName(name);
            p[i].setId(id);
            p[i].setPrice(price);

            

        }

        System.out.println("Display the All Products");
        for(int i=0;i<p.length;i++)
        {
            System.out.println(p[i].getName()+"\t"+p[i].getId()+"\t"+p[i].getPrice());
        }

        for(int i=0;i<p.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                if(p[i].getPrice()>p[j].getPrice())  // descending sort
                {
                    Products temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
        System.out.println("Display After the All Products");
        for(int i=0;i<p.length;i++)
        {
            System.out.println(p[i].getName()+"\t"+p[i].getId()+"\t"+p[i].getPrice());
        }

        

    }
 }

 
