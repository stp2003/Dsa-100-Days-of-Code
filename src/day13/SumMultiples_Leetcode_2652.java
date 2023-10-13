package day13;

public class SumMultiples_Leetcode_2652 {

    //??
    public static int sumOfMultiples(int n) {

        int sum3 = 0, sum5 = 0, sum7 = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) sum3 += i;
            else if (i % 5 == 0) sum5 += i;
            else if (i % 7 == 0) sum7 += i;
        }
        return (sum3 + sum5 + sum7);
    }

    public static void main(String[] args) {
        System.out.println(sumOfMultiples(10));
    }
}
