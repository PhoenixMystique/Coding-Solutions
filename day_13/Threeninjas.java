package day_13;

import java.util.ArrayList;
import java.util.Collections;

public class Threeninjas {
    public static int ninjaCandidate(ArrayList<Integer> arr) {
        int n=arr.size();


        Collections.sort(arr);

        int beg=arr.get(n-1)*arr.get(n-2)*arr.get(n-3);
        int last=arr.get(0)*arr.get(1)*arr.get(2);
        return Math.max(beg,last);
    }
}
