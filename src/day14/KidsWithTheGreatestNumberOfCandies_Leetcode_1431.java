package day14;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies_Leetcode_1431 {

    //??
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxInititalCandies = 0;

        for (int candy : candies) {
            maxInititalCandies = Math.max(maxInititalCandies, candy);
        }

        List<Boolean> ans = new ArrayList<>();

        for (int candy : candies) {
            if (candy + extraCandies >= maxInititalCandies) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,4,5,6,3}, 5));
    }
}
