package day6;

import java.util.Scanner;

public class FindTheIndexOfTheFirstOccurrence_Leetcode_28 {

    //??
    public static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String haystack = scanner.nextLine();
        String needle = scanner.nextLine();

        System.out.println(strStr(haystack, needle));
    }
}
