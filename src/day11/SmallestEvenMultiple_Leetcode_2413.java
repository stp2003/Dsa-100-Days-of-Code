package day11;

public class SmallestEvenMultiple_Leetcode_2413 {

    //??
    public static int smallestEvenMultiple(int n) {

        if(n % 2 == 0)
            return n;
        else
            return n * 2;
    }

    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
    }
}
