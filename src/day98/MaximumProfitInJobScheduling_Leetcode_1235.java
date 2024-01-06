package day98;

import java.util.Arrays;

public class MaximumProfitInJobScheduling_Leetcode_1235 {

    //??
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int ans = 0;
        int n = profit.length;
        int[][] events = new int[2 * n][3];
        for (int i = 0; i < n; ++i) {
            events[i][0] = startTime[i];
            events[i][1] = i;
            events[i][2] = 0;
        }
        for (int i = n; i < 2 * n; ++i) {
            events[i][0] = endTime[i - n];
            events[i][1] = i - n;
            events[i][2] = 1;
        }

        Arrays.sort(events, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[2], a[2]);
            }
            return Integer.compare(a[0], b[0]);
        });

        for (int[] event : events) {
            if (event[2] == 0) {
                profit[event[1]] += ans;
            } else {
                ans = Math.max(ans, profit[event[1]]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
