package day1;

import java.util.Scanner;

public class ReverseWordsInString_Leetcode_557 {

    //??
    public static String reverseWords(String s) {

        String[] res = s.split(" ");
        String rev = "";

        for (String w : res) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();

            rev += sb.toString() + " ";
        }
        return rev.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(reverseWords(str));

    }
}
