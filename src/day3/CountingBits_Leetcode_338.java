package day3;

import java.util.Arrays;
import java.util.Scanner;

public class CountingBits_Leetcode_338 {

    //??
    public static int[] countBits(int n) {

        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            String str = Integer.toBinaryString(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(Arrays.toString(countBits(n)));
    }
}
