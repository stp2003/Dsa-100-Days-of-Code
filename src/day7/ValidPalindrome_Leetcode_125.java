package day7;

import java.util.Scanner;

public class ValidPalindrome_Leetcode_125 {

    //??
    public static boolean isPalindrome(String s) {

        String res = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean ans = true;

        for (int i = 0; i < res.length(); i++) {

            if (res.charAt(i) == res.charAt(res.length() - 1 - i)) {
                continue;
            } else {
                ans = false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s));
    }
}
