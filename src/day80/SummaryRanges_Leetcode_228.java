package day80;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_Leetcode_228 {

    //??
    public static List<String> summaryRanges(int[] nums) {

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1])
                i++;

            if (start != nums[i]) {
                arrayList.add(start + "->" + nums[i]);
            } else {
                arrayList.add(String.valueOf(start));
            }
        }
        return arrayList;
    }
}
