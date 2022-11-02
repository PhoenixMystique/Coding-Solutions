package day8;

public class max2x2square {
    public static long numberOfSquares(long base)
    {
        long  ans=0,i=0;
        i=base%2==0?base-2:base-3;
        ans=i/2;
        ans=(ans*(ans+1))/2;
        return ans;
    }
}
