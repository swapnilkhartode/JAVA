
/*
 // the super keyword in java is a referece variable which is used to refer immediate parent class object.
// Usage of java super keyword :
 1} super can be used to refer immediate parent class instance variable.
 2} super can be used to invoke immediate parent class method.
 3} super() can be used to invoke immediate parent class constructor.
 */


 // Example 1 : super is used to refer immediate parent class instance variable.
 // we can use super keyword to access the data member of parent class. it is used if parent class and child class have same fields(data member)  
 // super keyword can also be used to invoke parent class method. it should be used if class contains same nethod as parent class.
 // it is used if mathod is overridden.

 /*
  if we call eat() method from dog class , it will call the eat() method of Dog class by default because priority is given to local.
  super.methodname;
  */
 
 class Animal
 {
    String color="white";
    void eat()
    {
        System.out.println("EAting Animal.....");
    }
 }
 class Dog extends Animal
 {
    String color="black";
    void eat()
    {
        System.out.println("Eating Bread Dog...");
    }
    void work()
    {
        eat();
        super.eat();
    }

    void PrintColor()
    {
        System.out.println(color);  // Prints color of dog class
        System.out.println(super.color);  // prints color of Animal class
    }
 }

 class super1
 {
    public static void main(String x[])
    {
        Dog d=new Dog();
        d.PrintColor();
        System.out.println();
        d.work();
    }
 }