import java.util.*;



 class JaggedArray1
{
    public static void main(String x[])
    {
        int a[][] = new int[][]{
                                   {1,2,3},
                                   {4,5,6},
                                   {7,8,9}
                                };
        int result[]=getArr(a);
        

        for(int i=0;i<result.length;i++)
        {
            System.out.printf(result[i]+a[i][0]+"\t");
        }
    }
    public static int[] getArr(int a[][])
    {
        return new int[]{10,20,30};
    }
}
