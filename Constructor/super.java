class A{
    void show(){
        System.out.println("I am A method");
    }
}
class B extends A
{
     void show(){
        //super.show();
        A::show();
       System.out.println("I am B method");
     }
}

class p1
{
    public static void main(String x[])
    {
          B b=new B();
          b.show();
    }
}