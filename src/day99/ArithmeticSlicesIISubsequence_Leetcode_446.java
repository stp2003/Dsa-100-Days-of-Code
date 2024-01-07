package day99;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArithmeticSlicesIISubsequence_Leetcode_446 {

    //??
    public static int numberOfArithmeticSlices(int[] nums) {

        int ans = 0;
        int len = nums.length;
        List<Map<Integer, Integer>> mapList = new ArrayList<>(len);

        for (int i = 0; i < len; i++) {
            mapList.add(new HashMap<>(i));

            for (int j = 0; j < i; j++) {
                long diff = (long) (nums[j]) - nums[i];
                if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE) continue;

                int dif = (int) diff;
                int n2 = mapList.get(i).getOrDefault(dif, 0);
                int n1 = mapList.get(j).getOrDefault(dif, 0);
                ans += n1;
                int freq = n1 + n2 + 1;
                mapList.get(i).put(dif, freq);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numberOfArithmeticSlices(new int[]{1, 2, 5, 9, 6}));
    }
}
