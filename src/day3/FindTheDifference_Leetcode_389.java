package day3;

import java.util.Scanner;

public class FindTheDifference_Leetcode_389 {

    //??
    public static char findTheDifference(String s, String t) {

        char ans = 0;

        for (char cS : s.toCharArray()) {
            ans ^= cS;
        }
        for (char cT : t.toCharArray()) {
            ans ^= cT;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        System.out.println(findTheDifference(s, t));

    }
}
