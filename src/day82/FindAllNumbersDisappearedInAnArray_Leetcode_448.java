package day82;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInAnArray_Leetcode_448 {

    //??
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        //** we will add very element of nums in the set so that the duplicates are removed.
        for (int num : nums)
            set.add(num);

        //?? then we will add the elements in the list which are not present in the set
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i))
                ans.add(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
