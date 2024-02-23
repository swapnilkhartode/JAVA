/* Common Scenarios of java Exceptions 
  1] A scenario where ArithmeticException occurs :-
    -> If we devide any number by zero, there occurs an ArithmeticException.
       Eg. int a=50/0;
  2] A Scenario where NullPointerException occurs :-
    -> If we have a null value in any variable , performing any operation on the variable throws a NullPointerException.
     String s=null;
     System.out.println(s.length());
  3] A Scenario where NumberFormatException occurs :-
    -> If the formatting of any variable or number is mismatched, it may result into NumberFormatException. 
       Suppose , we have String variable that has characters, converting this variable into digit will cause NumberFormatException.
       Eg. String s="abc";
       int i = Integer.parseInt(s);  // NumberFormatException
  4]  A Scenario where ArrayIndexOutOfBoundException occurs :-
     -> When an array exceeds to its size, the ArrayIndexOutOfBoundException occurs. there may be other reasons to occur.
        Eg. int a[] = new int[5];
        a[10]=50; // ArrayIndexOutOfBoundException
  5] The java.lang.ClassNotFoundException is a checked exception in java that occurs when the Java Virtual Machine(JVM) attempts to load 
      a specific class, but cannot locate the class in the classpath.
      -> we can handled with a try-catch block or by using the throw clause.
      -> This Exception always occurs at runtime
      -> ClassNotFoundException occurs when we try to load the class using the forName,findSystemClass, and loadClass methods.
 */