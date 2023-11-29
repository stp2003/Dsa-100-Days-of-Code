package day60;

public class SumOfTwoIntegers_Leetcode_371 {

    //??
    public static int getSum(int a, int b) {

        if (a == 0) return b;
        if (a < 0)
            return getSum(++a, --b);
        else
            return getSum(--a, ++b);
    }

    public static void main(String[] args) {
        System.out.println(getSum(2,3));
    }
}
