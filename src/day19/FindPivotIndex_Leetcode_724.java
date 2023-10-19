package day19;

public class FindPivotIndex_Leetcode_724 {

    //??
    public static int pivotIndex(int[] nums) {

        int pivot = 0;

        while (pivot < nums.length) {
            int left = 0, right = 0;
            for (int i = 0; i < pivot; i++) {
                left += nums[i];
            }
            for (int i = pivot + 1; i < nums.length; i++) {
                right += nums[i];
            }
            if (left == right) {
                return pivot;
            } else {
                pivot++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 2, 3, 4, 5, 6}));
    }
}
