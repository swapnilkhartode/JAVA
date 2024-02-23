//  Object With Variable arguments

class Product1 // Pojo classs with setter and getter
{
    private int id;
    private String name;
    private float price;

    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPrice(float price)
    {
        this.price=price;
    }
    public int getId()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public float getPrice()
    {
        return price;
    }
}
class Shop1
{
    private Product product[];
    public void setProductDetails(Product ...product)
    {
        this.product=product;
    }
    public void show()
    {
        for(int i=0;i<product.length;i++)
        {
            System.out.println(product[i].getId()+"\t"+product[i].getName()+"\t"+product[i].getPrice()+"\n");
        }
    }
}
public class ShopApp1
{
    public static void main(String x[])
    {
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("ABC");
        p1.setPrice(50.2f);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("PQR");
        p2.setPrice(65.3f);

        Product p3 = new Product();
        p3.setId(3);
        p3.setName("XYZ");
        p3.setPrice(75.3f);

        Shop1 s = new Shop1();
        s.setProductDetails(p1,p2,p3);
        s.show();
    }
}