package day143;

public class MissingNumber_Leetcode_268 {

    //??
    public static int missingNumber(int[] nums) {

        int sum = 0;
        int n = nums.length;

        for (int num : nums) {
            sum += num;
        }

        int actualSum = n * (n + 1) / 2;
        return actualSum - sum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1, 4, 8, 9, 6}));
    }
}
