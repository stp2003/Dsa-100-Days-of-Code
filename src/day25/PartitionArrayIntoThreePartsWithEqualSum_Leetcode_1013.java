package day25;

import java.util.Arrays;

public class PartitionArrayIntoThreePartsWithEqualSum_Leetcode_1013 {

    //??
    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = Arrays.stream(arr).sum();

        if (sum % 3 != 0) {
            return false;
        }

        int partitionSum = sum / 3;
        int numberOfPartition = 0;
        int tempSum = 0;

        for (int j : arr) {
            tempSum += j;
            if (tempSum == partitionSum) {
                numberOfPartition++;
                tempSum = 0;
            }
            if (numberOfPartition == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{1, 1, 1, 3, 2, 1}));
    }
}
