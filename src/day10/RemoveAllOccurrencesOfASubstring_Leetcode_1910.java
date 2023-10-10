package day10;

import java.util.Scanner;

public class RemoveAllOccurrencesOfASubstring_Leetcode_1910 {

    //??
    public static String removeOccurrences(String s, String part) {

        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String part = scanner.nextLine();

        System.out.println(removeOccurrences(s, part));
    }
}
