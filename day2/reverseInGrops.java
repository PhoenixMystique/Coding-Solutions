package day2;

import java.util.ArrayList;

public class reverseInGrops {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    reverseInGroups(list,5,3);
    }
    static void reverseInGroups(ArrayList arr, int n, int k)
    {
        for (int i = 0; i < n; i += k) {
            int part1 = i;
         int part2 = Math.min(i + k - 1, n - 1);
         while (part1 <part2) {
               int temp = (int) arr.get(part1);
                arr.set(part1,arr.get(part2));
                arr.set(part2,temp);
                part1+=1;
                part2-=1;
            }
        }
        System.out.println(arr.toString());
    }
}
