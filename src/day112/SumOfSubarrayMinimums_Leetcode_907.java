package day112;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SumOfSubarrayMinimums_Leetcode_907 {

    //??
    public static int sumSubarrayMins(int[] arr) {

        final int kMod = 1_000_000_007;
        final int n = arr.length;
        long ans = 0;
        int[] prevMin = new int[n];
        int[] nextMin = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        Arrays.fill(prevMin, -1);
        Arrays.fill(nextMin, n);

        for (int i = 0; i < arr.length; ++i) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                final int index = stack.pop();
                nextMin[index] = i;
            }
            if (!stack.isEmpty())
                prevMin[i] = stack.peek();
            stack.push(i);
        }

        for (int i = 0; i < arr.length; ++i) {
            ans += (long) arr[i] * (i - prevMin[i]) * (nextMin[i] - i);
            ans %= kMod;
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(sumSubarrayMins(new int[]{1, 2, 3, 6, 5}));
    }
}
