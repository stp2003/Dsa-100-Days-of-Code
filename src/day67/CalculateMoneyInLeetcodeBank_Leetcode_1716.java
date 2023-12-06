package day67;

public class CalculateMoneyInLeetcodeBank_Leetcode_1716 {

    //??
    public static int totalMoney(int n) {
        int ans = 0;

        for (int i = 0; i < n; ++i) {
            int curr_weak = i / 7;
            int curr_day = i % 7;

            ans += curr_weak + curr_day + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(totalMoney(5));
    }
}
