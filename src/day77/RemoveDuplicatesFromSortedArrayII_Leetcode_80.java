package day77;

public class RemoveDuplicatesFromSortedArrayII_Leetcode_80 {

    //??
    public static int removeDuplicates(int[] nums) {

        int count = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[count - 2] != nums[i]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 1, 2, 2, 3, 3, 3}));
    }
}
