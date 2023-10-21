package day21;

import java.util.Arrays;

public class DistributeCandies_Leetcode_575 {

    //??
    public static int distributeCandies(int[] candyType) {

        Arrays.sort(candyType);
        int count = 1;
        int flag = candyType[0];

        for (int i : candyType) {

            if (i != flag) {
                count++;
                flag = i;
            }

        }
        return Math.min(count, candyType.length / 2);
    }

    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1, 1, 2, 2, 2, 3, 3}));
    }
}
