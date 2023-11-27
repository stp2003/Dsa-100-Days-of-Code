package day58;

public class LargestOddNumberInString_Leetcode_1903 {

    //??
    public static String largestOddNumber(String num) {

        String ans = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            int n = (int) num.charAt(i) - '0';
            if (n % 2 != 0) {
                ans = ans + num.substring(0, i + 1);
                break;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
    }
}
