package day7;

public class countBits {
    public static void main(String[] args) {
        System.out.println(countOnBits(9));
    }
    public static int countOnBits(int num) {
        int ans=0;
        String binary = Integer.toBinaryString(num);

        for (int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                ans++;
            }
        }
        return ans;
    }
}
