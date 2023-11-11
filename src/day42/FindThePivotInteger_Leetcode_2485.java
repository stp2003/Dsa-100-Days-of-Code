package day42;

public class FindThePivotInteger_Leetcode_2485 {

    //??
    public static int pivotInteger(int n) {

        int totalSum = n * (n + 1) / 2;
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum += i;
            if (totalSum - leftSum + i == leftSum)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotInteger(5));
    }
}
