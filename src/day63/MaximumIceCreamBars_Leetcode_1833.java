package day63;

import java.util.Arrays;

public class MaximumIceCreamBars_Leetcode_1833 {

    //??
    public static int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);
        int count = 0;

        for (int cost : costs) {
            if (coins >= cost) {
                coins -= cost;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxIceCream(new int[]{1, 2, 3, 4, 5}, 3));
    }
}
