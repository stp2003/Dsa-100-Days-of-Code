package day29;

import java.util.Arrays;

public class FindThreeConsecutiveIntegersThatSumToGivenNumber_Leetcode_2177 {

    //??
    public static long[] sumOfThree(long num) {

        long flag = num / 3;
        if (num % 3 == 0) {
            return new long[]{flag - 1, flag, flag + 1};
        }

        return new long[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfThree(33)));
    }
}
