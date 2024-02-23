
public class ReferenceToPrimitive4 {
    public static void main(String x[]) {
        /*
         * valueOf() method is used for convert primitive type of value in to reference
         * type and it is static method present in every wrapper
         * class. and it is static method present in every wrapper class.
         * Suppose consider we have integer primitive value and we want to convert
         * integer reference or we have integer value and we want to convert
         * string reference.
         * 
         */

        int a = 100;
        Integer b = Integer.valueOf(a); // convert primitive type of integer in reference Integer.
        System.out.println("B is : " + b);

        int c = 12345;
        String s = String.valueOf(c); // convert primitive type of integer into String type.
        System.out.println("S is " + s);
    }
}