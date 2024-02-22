package day145;

public class FindTheTownJudge_Leetcode_977 {

    //??
    public static int findJudge(int n, int[][] trust) {

        int[] trusting = new int[n + 1];
        int[] trusted = new int[n + 1];

        for (int[] ints : trust) {
            trusting[ints[0]]++;
            trusted[ints[1]]++;
        }

        int ans = -1;

        for (int i = 1; i <= n; i++) {
            if (trusting[i] == 0 && trusted[i] == n - 1)
                ans = i;
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(findJudge(5, new int[][]{{1, 8, 96, 5}, {5, 896, 32, 5}}));
    }
}
