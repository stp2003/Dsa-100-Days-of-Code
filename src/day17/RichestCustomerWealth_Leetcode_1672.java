package day17;

public class RichestCustomerWealth_Leetcode_1672 {

    //??
    public static int maximumWealth(int[][] accounts) {
        int col = accounts[0].length;
        int max = 0;

        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += account[j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1, 2, 3}, {5, 6, 3}}));
    }
}
