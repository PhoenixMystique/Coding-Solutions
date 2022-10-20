package day9;

import java.util.ArrayList;
import java.util.Collections;

public class squareOfSortedArray {
    public static ArrayList<Integer> sqsorted(ArrayList<Integer> arr) {

        for(int i=0;i<arr.size();i++){
            arr.set(i,Math.abs(arr.get(i)*arr.get(i)));
        }
        Collections.sort(arr);
        return arr;
    }
}
