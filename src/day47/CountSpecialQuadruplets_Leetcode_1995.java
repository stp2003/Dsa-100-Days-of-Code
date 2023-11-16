package day47;

public class CountSpecialQuadruplets_Leetcode_1995 {

    //??
    public static int countQuadruplets(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if (nums[i] + nums[j] + nums[k] == nums[l]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countQuadruplets(new int[]{1, 2, 3, 4, 5}));
    }
}
