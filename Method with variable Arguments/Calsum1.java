/*
  ->  Method with variable arguments means we can pass infinite parameters function called as mwthod with variable arguments.
      and this ... indicate run time array internally.


Example : We want to calculate sum of all infinite integers
 */


 class Calsum1
 {
     void findSum(int ...x)
     {
         int s=0;
         for(int i=0; i<x.length;i++)
         {
             s=s+x[i];
         }
         System.out.printf("Sum of all integers is %d\n",s);
     }
     public static void main(String x[])
     {
         Calsum cs = new Calsum();
         cs.findSum(10,20,30,40,50);
         cs.findSum(10,20,30,40,50,60,70,80);
         cs.findSum(10,20,30,40,50,60,70,80,90,100);
     }
 
 }/*
 hackerrank, github
 java giri tech hub notes
 */
 
 