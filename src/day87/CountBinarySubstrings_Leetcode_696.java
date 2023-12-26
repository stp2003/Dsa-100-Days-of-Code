package day87;

public class CountBinarySubstrings_Leetcode_696 {

    //??
    public static int countBinarySubstrings(String s) {

        int count = 1;
        int flag = 0;
        int ans = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans += Math.min(flag, count);
                flag = count;
                count = 1;
            }
        }
        ans += Math.min(flag, count);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }
}
