package day2;

public class reverseInGrops {
    public static void main(String[] args) {
  int[] data ={1,2,3,4,5};
    reverseInGroups(data,5,3);
    }
    static void reverseInGroups(int arr[], int n, int k)
    {
        for (int i = 0; i < n; i += k) {
            int part1 = i;
         int part2 = Math.min(i + k - 1, n - 1);
         while (part1 <part2) {
               arr[part1]+=arr[part2];
               arr[part2]=arr[part1]-arr[part2];
                arr[part1]=arr[part1]- arr[part2];
                part1+=1;
                part2-=1;
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
