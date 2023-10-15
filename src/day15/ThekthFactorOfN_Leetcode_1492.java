package day15;

public class ThekthFactorOfN_Leetcode_1492 {

    //??
    public static int kthFactor(int n, int k) {

        int res = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res += 1;
            }
            if (res == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(kthFactor(5, 3));
    }
}
