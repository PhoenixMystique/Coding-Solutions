package day9;

import java.util.ArrayList;
import java.util.HashSet;

public class findDuplicateInArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        System.out.println(findDuplicate(list));
    }
    public static int findDuplicate(ArrayList<Integer> arr) {
        HashSet<Integer> set = new HashSet();
        for(int i=0; i<arr.size();i++){
            if(set.contains(arr.get(i))){

                return arr.get(i);
            }
            else{
                set.add(arr.get(i));

            }
        }
        return -1;
    }
    }

