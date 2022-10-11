package day1;

public class fly_game {
    public static void main(String[] args) {
        int[] arr = {4,1,1,1,0,3};
      System.out.println(flyingBird(arr));
    }

    static boolean flyingBird(int[] arr){
        int current = 0,till = 0;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            till = Math.max(till , arr[i]+i);
            if(current == i){
                current = till;
            }
        }
        if(current>= arr.length-1){
            return true;
        }
        return false;

    }
}
