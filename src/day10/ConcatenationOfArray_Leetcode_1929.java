package day10;

public class ConcatenationOfArray_Leetcode_1929 {

    //??
    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;

        int[] res = new int[2 * n];

        for (int i = 0; i < n; i++) {
            res[i] = nums[i];
            res[i + n] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
