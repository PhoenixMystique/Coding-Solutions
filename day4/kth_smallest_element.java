package day4;

import java.util.PriorityQueue;

public class kth_smallest_element {

    public static void main(String[] args) {

    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i:arr){
            queue.add(i);
        }
        for(int j=0;j<k;j++){
            if(j==k-1){
                return queue.peek();
            }
            queue.poll();
        }
        return -1;
    }

}
