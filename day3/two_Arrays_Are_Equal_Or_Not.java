package day3;

import java.util.Arrays;

public class two_Arrays_Are_Equal_Or_Not {
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<N;i++){
            if(A[i]!=B[i]){
                return false;
            }
        }
        return true;
    }
}
