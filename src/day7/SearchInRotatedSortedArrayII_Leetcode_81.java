package day7;

public class SearchInRotatedSortedArrayII_Leetcode_81 {

    //??
    public static boolean search(int[] nums, int target) {

        for (int num : nums) {
            if (num == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,5,6,8,9,6,4,8,3,1};
        int target = 8;
        System.out.println(search(nums, target));
    }
}
