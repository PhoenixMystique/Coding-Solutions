package day3;

import java.util.HashMap;

public class first_number_to_appear_k_times {

    public int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i:a){
            map.merge(i, 1, Integer::sum);
            if(map.get(i)==k){
                return i;
            }

        }
        return -1;
    }
}
