package day70;

public class KItemsWithTheMaximumSum_Leetcode_2600 {

    //??
    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        return Math.min(k, numOnes) - Math.max(0, k - numOnes - numZeros);
    }

    public static void main(String[] args) {
        System.out.println(kItemsWithMaximumSum(3, 2, 0, 2));
    }
}
