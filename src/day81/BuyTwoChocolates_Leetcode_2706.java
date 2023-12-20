package day81;

import java.util.Arrays;

public class BuyTwoChocolates_Leetcode_2706 {

    //??
    public static int buyChoco(int[] price, int money) {

        Arrays.sort(price);

        int total = price[0] + price[1];

        return (money >= total) ? money - total : money;
    }

    public static void main(String[] args) {
        System.out.println(buyChoco(new int[]{2, 1, 3}, 3));
    }
}
