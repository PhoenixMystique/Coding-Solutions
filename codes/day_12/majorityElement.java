package day_12;

import java.util.HashMap;

public class majorityElement {
    public static int findMajority(int[] arr, int n) {
        n=n/2;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i:arr){
            map.merge(i,1,Integer::sum);
        }
        for(HashMap.Entry<Integer,Integer> set:map.entrySet()){
            if(set.getValue()>n){return set.getKey();}
        }
        return -1;
    }
}
