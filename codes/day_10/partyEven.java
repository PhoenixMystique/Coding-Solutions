package day_10;

public class partyEven {

    public static int[] parityMove(int a[], int n) {
        int intial=0,back=n-1;
        while(intial<=back){
            if(a[intial]%2!=0){
                if(a[back]%2==0){
                    int temp =a[back];
                    a[back]=a[intial];
                    a[intial] =temp;
                    back--;
                    intial++;
                }
                else{
                    back--;
                }
            }
            else{
                intial++;
            }
        }
        return a;

    }
}
