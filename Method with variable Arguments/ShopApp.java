/*
 Wap to create class name as Shop and one more class name as Product and Product is our POJO classs which contain  id,name,price
 */
class Product     // POJO class
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
    public String getName()
    {
        return name;
    }
    public float getPrice()
    {
        return price;
    } 
}

class Shop
{
    private Product product;
//                                        1000         
    public void setProductDetails(Product product)
    {
            this.product=product;    
    }
    public void Show()
    {
        System.out.println(product.getId()+"\t"+product.getName()+"\t"+product.getPrice());
    }
}

public class ShopApp
{
    public static void main(String x[])
    {
         Product p1 = new Product();//1000
         p1.setId(1);
         p1.setName("SWAPNIL");
         p1.setPrice(50.2f);

         Shop s = new Shop();
         s.setProductDetails(p1);//s.setProductDetails(1000)
         s.Show();
    }
}