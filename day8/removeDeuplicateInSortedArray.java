package day8;

public class removeDeuplicateInSortedArray {
    int remove_duplicate(int A[],int N){
        int ans = 1;
        for(int i=1; i<N; i++) {
            if(A[i] != A[i-1]) {
                A[ans++] = A[i];
            }
        }
        return ans;
    }
}
