package day4;

import java.util.Scanner;

public class IsSubsequence_Leetcode_392 {

    //??
    public static boolean isSubsequence(String s, String t) {
        int i = 0;

        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return (i == s.length());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        System.out.println(isSubsequence(s, t));
    }
}
