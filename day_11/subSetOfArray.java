package day_11;

public class subSetOfArray {
    public static boolean checkSubset(int[] arr1, int[] arr2, int n, int m) {
        if(arr2.length>arr1.length){return false;}
        for(int j:arr2){
            boolean flag=false;
            for(int i=0;i<arr1.length;i++){
                if(j==arr1[i]){
                    flag=true;
                    arr1[i]=Integer.MAX_VALUE;
                    break;
                }
            }
            if(!flag){return false;}
        }
        return true;
    }
}
