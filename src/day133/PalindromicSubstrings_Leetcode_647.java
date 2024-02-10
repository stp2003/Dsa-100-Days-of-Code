package day133;

public class PalindromicSubstrings_Leetcode_647 {

    //??
    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public static int countSubstrings(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j)) ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abkfgh"));
    }
}
