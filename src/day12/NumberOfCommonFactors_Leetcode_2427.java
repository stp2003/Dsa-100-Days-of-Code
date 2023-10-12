package day12;

public class NumberOfCommonFactors_Leetcode_2427 {

    //??
    public static int commonFactors(int a, int b) {

        int count = 0;
        int flag = Math.max(a, b);

        for (int i = 1; i <= flag; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(commonFactors(12, 6));
    }
}
