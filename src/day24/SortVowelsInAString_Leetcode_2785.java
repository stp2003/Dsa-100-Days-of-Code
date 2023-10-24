package day24;

import java.util.Arrays;

public class SortVowelsInAString_Leetcode_2785 {

    //??
    public static String sortVowels(String s) {
        StringBuilder temp = new StringBuilder();
        for (char x : s.toCharArray()) {
            if (checkVowels(x)) {
                temp.append(x);
            }
        }
        char[] tempArray = temp.toString().toCharArray();
        Arrays.sort(tempArray);
        temp = new StringBuilder(new String(tempArray));
        int j = 0;
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (checkVowels(s.charAt(i))) {
                result.setCharAt(i, temp.charAt(j));
                j++;
            }
        }
        return result.toString();
    }

    public static boolean checkVowels(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        System.out.println(sortVowels("shashwat"));
    }
}
