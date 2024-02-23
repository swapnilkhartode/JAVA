
import java.util.*;
class Product
{
    private int id;
    private String Name;
    private int price;

    public void setProductDetails(String Name,int price,int id)
    {
        this.id=id;
        this.Name=Name;
        this.price=price;

    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return Name;
    }
    public int getPrice()
    {
        return price;
    }

}

public class ProductApp
{
    public static void main(String x[])
    {
        Scanner xyz= new Scanner(System.in);
        Product p[]=new Product[5];
        for(int i=0;i<p.length;i++)
        {
            
            p[i]=new Product();
            
            System.out.println("Enter the  Name and Price and id respectively");
            
            String name=xyz.nextLine();
            int price=xyz.nextInt();
            int id=xyz.nextInt();

            p[i].setProductDetails(name, price,id);
        }
        // Arrange All products in descending order by price

        for(int i=0;i<p.length;i++)
        {
            for(int j=i+1;j<p.length;j++)
            {
                int p1=p[i].getPrice();
                int p2=p[j].getPrice();
                if(p1 <p2 )
                {
                    Product temp=p[i];
                    p[i]=p[j];
                    p[j]=temp;

                }
            }

            
        }
        System.out.println("Products Arranged in descending order by peice ");
        for(int i=0;i<p.length;i++)
        {
            System.out.println(p[i].getPrice()+"\t"+p[i].getName()+"\t"+p[i].getId());

            
        }


    }
}