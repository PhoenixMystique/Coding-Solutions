package day6;

public class validPallindrome2 {
    public static void main(String[] args) {
        System.out.println(validPalindrome(5,"ABCDCBA"));
    }
    public static boolean validPalindrome(int n, String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo <= hi) {
            if (s.charAt(lo) == s.charAt(hi)) {
                ++lo;
                --hi;
            } else
                return isPalindrome(s, lo + 1, hi) | isPalindrome(s, lo, hi - 1);
        }
        return true;
    }
    private static boolean isPalindrome(String s, int lo, int hi) {
        while (lo <= hi) {
            if (s.charAt(lo) != s.charAt(hi))
                return false;
            ++lo;
            --hi;
        }
        return true;
    }
}
