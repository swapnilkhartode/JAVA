import java.util.*;
import java.util.Collections;

public class ArrayList {
    public static void main(String x[]) {
        Scanner asd = new Scanner(System.in);
        int choice, ch;
        
        do {
            System.out.println("1 : Display all Elements");
            System.out.println("2 : Search specific element");
            System.out.println("3 : Add new Element");
            System.out.println("4 : Delete element");
            System.out.println("5 : Sort element in the Ascending order");
            System.out.println("6 : Sort elements in the Descending order");
            System.out.println("7 : Find Max Element");
            System.out.println("8 : Find Min Element");
            System.out.println("0 : Exist");

            System.out.println("Enter the Choice");
            choice = asd.nextInt();

            ArrayList al = new ArrayList();
           
           
            Iterator I = al.iterator();
            switch (choice) {
                case 1: 
                {
                    for(int i=0; i<al.size();i++)
                    {
                        Object obj = I.next();
                        System.out.println(obj);
                    }

                    break;
                }
                case 2: 
                {



                    break;
                }
                case 3: 
                {
                    /*
                         Adding Elements
                          1] in order to add an element to an arrayList, we can
                     */
                    System.out.println("Enter the Number");
                    int a= asd.nextInt();
                    al.add(a);
                    System.out.println("Number added SuccessFully !!!!!!");

                    break;
                }
                case 4: 
                {
                    // Delete Element
                    System.out.println("Enter the index of which element is to be deleted");
                    int s=asd.nextInt();
                    Object obj = al.remove(s);
                    if(obj != null)
                    {
                        System.out.println("Element deleted Sucessfully is : "+obj);
                    }
                    else
                    {
                        System.out.println("Element not deleted....");
                    }


                    break;
                }
                case 5: 
                {

                    break;
                }
                case 6: {

                    break;
                }
                case 7: {

                    break;
                }
                case 8: {

                    break;
                }
                default:
                    System.out.println("Wrong Choice");

            }
            System.out.println("Do you want to continue");
            ch = asd.nextInt();

        } while (ch != 0);
    }

    private Object remove(int s) {
        return null;
    }

    private int size() {
        return 0;
    }

    Iterator iterator() {
        return null;
    }

    void add(int i) {
    }

    public void add(Employee emp1) {
    }
}