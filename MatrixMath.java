
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    // instance variables - replace the example below with your own
    private int[][] A;

    /**
     * Constructor for objects of class MatrixMath
     */
    public MatrixMath(int[][] A)
    {
        this.A = A;
       
    }

    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */
    public int[] rowSum()
{
int[] sumRow= new int[A.length];

for (int i=0 ; i<A.length ; i++){
    int sum=0;
    for (int j=0 ; j<A[i].length ; j++){
        sum+=A[i][j];
    }
    sumRow[i]=sum;
    }
    return sumRow;
}
    
        /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve()
    {
        double[] haha = new double[A.length];
        int[] sums = rowSum();
        for(int i = 0;i<A.length;i++){
            haha[i]=(sums[i]+0.0)/A[i].length;
    }
    return haha;
    }
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        int [] D = new int[A[0].length];
    int sumsum = 0;
    for(int i = 0; i<A[0].length; i++){
      for(int c = 0; c<A.length; c++){
        sumsum+=A[c][i];
      }
      D[i] = sumsum;
      sumsum = 0;
    }
    return D;
}
    
     /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
        double[] haha = new double[A.length];
        int[] sums = colSum();
        for(int i = 0;i<A.length;i++){
            haha[i]=(sums[i]+0.0)/A.length;
    }
    return haha;
    
}
}
