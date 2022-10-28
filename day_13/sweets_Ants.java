package day_13;

import java.util.Stack;

public class sweets_Ants {
    public static void main(String[] args) {
       int[] data ={0,3,0,0,1,3};
       int[] ans = sweet(data);
       for (int i:ans){
           System.out.println(i);
       }
    }


        public static int[] sweet(int[] S) {

            int n = S.length;
            Stack<Integer> st = new Stack<>();

            int[] ans = new int[n];
            for (int i = 0; i < n; ++i)
            {
                st.push(i + 1);

                while(!st.empty() && (i + 1 - st.peek()) < S[i])
                {
                    ans[st.peek() - 1] = 1;
                    st.pop();
                }
            }
            return ans;
        }

}
