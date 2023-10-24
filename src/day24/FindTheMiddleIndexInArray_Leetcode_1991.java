package day24;

public class FindTheMiddleIndexInArray_Leetcode_1991 {

    //??
    public static int findMiddleIndex(int[] nums) {

        if (nums.length < 1)
            return -1;

        int rightSum = 0, leftSum = 0;

        for (int x : nums)
            rightSum += x;

        for (int x = 0; x < nums.length; x++) {
            rightSum -= nums[x];
            if (rightSum == leftSum)
                return x;
            leftSum += nums[x];
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findMiddleIndex(new int[]{1, 6, -3, 8, 4}));
    }
}
