package day51;

import java.util.Arrays;

public class SplitWithMinimumSum_Leetcode_2578 {

    //??
    public static int splitNum(int num) {

        char[] digit = String.valueOf(num).toCharArray();
        Arrays.sort(digit);

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < digit.length; i++) {
            if (i % 2 == 0) {
                a.append(digit[i]);
            } else {
                b.append(digit[i]);
            }
        }

        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
    }

    public static void main(String[] args) {
        System.out.println(splitNum(4325));
    }
}
