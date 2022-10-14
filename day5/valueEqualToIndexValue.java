package day5;

import java.util.ArrayList;

public class valueEqualToIndexValue {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList();
        for(int i=1;i<=n;i++){
            if(i==arr[i-1]){
                list.add(arr[i-1]);
            }
        }
        return list;
    }
}
