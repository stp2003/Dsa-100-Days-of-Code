package day84;

public class MaximumScoreAfterSplittingAString_Leetcode_1422 {

    //??
    public static int maxScore(String s) {
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                totalOnes++;
            }
        }

        int res = 0;
        int leftZeros = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                totalOnes--;
            }
            res = Math.max(res, (leftZeros + totalOnes));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
    }
}
