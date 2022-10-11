package day2;

import java.util.Arrays;

public class swap_and_maximize {

    static long maxSum(long arr[] ,int n)
    {long sum=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sum += Math.abs(arr[n-i-1]-arr[i]);
        }
        return sum;
    }

}
