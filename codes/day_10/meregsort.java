package day_10;

public class meregsort {
    public static void main(String[] args) {
     int[]  arr=new int[10000000];
     for (int i=0;i<arr.length;i++){
         arr[i]=arr.length-i;
     }
        mergeSort(arr,0, arr.length-1);
        for(int k:arr){
            System.out.print(k);
            System.out.print(" ");
        }
    }
    static void merge(int arr[], int l, int m, int r)
    {

        int l1 = m - l + 1;
        int l2 = r - m;
        int Left[] = new int[l1];
        int Right[] = new int[l2];


        for (int i = 0; i < l1; ++i)
            Left[i] = arr[l + i];
        for (int j = 0; j < l2; ++j)
            Right[j] = arr[m + 1 + j];
        int i = 0, j = 0;


        int k = l;
        while (i < l1 && j < l2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            }
            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < l1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < l2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int arr[], int l, int r)
    {
        if(l<r){

            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);

        }

    }
}
