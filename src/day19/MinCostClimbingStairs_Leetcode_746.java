package day19;

public class MinCostClimbingStairs_Leetcode_746 {

    //??
    public static int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int ans;
        for (int i = 2; i < n; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        ans = Math.min(cost[n - 1], cost[n - 2]);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1, 2, 3, 4, 5, 6}));
    }
}
