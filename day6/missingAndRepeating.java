package day6;

import java.util.ArrayList;
import java.util.Collections;

public class missingAndRepeating {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        System.out.println(missingAndRepeating(list,list.size())[0]);
        System.out.println(missingAndRepeating(list,list.size())[1]);
    }
        public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
            Collections.sort(arr);
            int[] res = new int[2];

            if(arr.get(0)!=1){
                res[0]=1;
            }
            if(arr.get(n-1)==arr.get(n-2)){
                res[0]=arr.get(n-1)+1;
            }

            for(int i=0;i<arr.size()-1;i++){
                if(arr.get(i)!=arr.get(i+1)){
                    if(arr.get(i)+1!=i+2){
                        res[0]=arr.get(i)+1;
                    }
                }
                else{
                    res[1]=arr.get(i);
                }
            }
            return res;
        }
}
