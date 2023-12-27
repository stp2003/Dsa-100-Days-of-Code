package day88;

public class MinimumTimeToMakeRopeColorful_Leetcode_1587 {

    //??
    public static int minCost(String colors, int[] neededTime) {

        int ans = 0;
        int n = colors.length();
        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                ans += Math.min(neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minCost("abaac", new int[]{1, 2, 3, 4, 5}));
    }
}
