package day7;

import java.util.Scanner;

public class JewelsAndStones_Leetcode_771 {

    //??
    public static int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        for (int i = 0; i < stones.length(); i++) {

            if (jewels.contains(String.valueOf(stones.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String j = scanner.nextLine();
        String s = scanner.nextLine();

        System.out.println(numJewelsInStones(j, s));
    }
}
