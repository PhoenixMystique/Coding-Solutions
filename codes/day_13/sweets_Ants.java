package codes.day_13;

import java.util.Stack;

public class sweets_Ants {
    public static void main(String[] args) {
       int[] data ={0,3,0,0,1,3};
       int[] ans = sweet2(data);
       for (int i:ans){
           System.out.println(i);
       }
    }


        public static int[] sweet(int[] S) {

            int[] result = new int[S.length];
            int[] freshness = new int[S.length];

            for (int i = 0; i < S.length; ++i)
            {
                freshness[i] = S.length;
                if(freshness[i] > S.length - S[i])
                {
                    result [i] = 1;
                }
                int j=i-1;
               while (j>=0)
                {
                    freshness[j] --;

                    if(freshness[j] >S.length - S[i])
                    {
                        result [j] = 1;
                    }
                    j--;
                }

            }
            return result ;
        }

    public static int[] sweet2(int[] S) {
            Stack<Integer> freshness = new Stack<>();
            int[] result = new int[S.length];
            for (int i=1;i<=S.length;i++){
                freshness.push(i);
                while (!freshness.isEmpty()){
                if(i-freshness.peek()<S[i-1]){
                    result[freshness.pop()-1] =1;
                }
                else {break;}
                }
            }
            return result;
    }
}
