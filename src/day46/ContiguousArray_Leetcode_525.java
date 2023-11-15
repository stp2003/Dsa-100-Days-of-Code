package day46;

import java.util.HashMap;

public class ContiguousArray_Leetcode_525 {

    //??
    public static int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> hashMaps = new HashMap<>();

        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : nums[i]);
            if (sum == 0)
                maxLength = i + 1;
            else if (hashMaps.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - hashMaps.get(sum));
            } else
                hashMaps.put(sum, i);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{1, 2, 3, 4, 5}));
    }
}
