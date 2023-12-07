package day68;

import java.util.Arrays;

public class MaximumElementAfterDecreasingAndRearranging_Leetcode_1846 {

    //??
    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {

        Arrays.sort(arr);
        arr[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(maximumElementAfterDecrementingAndRearranging(new int[]{2, 2, 1, 2, 1}));
    }
}
