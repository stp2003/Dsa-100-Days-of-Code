package day44;

public class MinimumSumOfMountainTripletsI_Leetcode_2908 {

    //??
    public static int minimumSum(int[] nums) {

        int result = Integer.MAX_VALUE;
        int flag = -1;

        for (int i = 0; i < nums.length - 2; i++) {

            for (int j = i + 1; j < nums.length - 1; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] < nums[j] && nums[k] < nums[j]) {

                        result = Math.min(result, nums[i] + nums[j] + nums[k]);
                        flag = 0;
                    }
                }
            }
        }
        return flag == 0 ? result : flag;
    }

    public static void main(String[] args) {
        System.out.println(minimumSum(new int[]{1, 2, 3}));
    }
}
