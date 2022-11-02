package day4;

import java.util.ArrayList;
import java.util.Collections;

public class leader_in_array {
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList();
        int j = Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--)
        {
            if(arr[i] >= j){
                j = arr[i];
                list.add(j);
            }   }
        Collections.reverse(list);
        return list;
    }
}
