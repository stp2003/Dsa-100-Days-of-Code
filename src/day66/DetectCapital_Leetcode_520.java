package day66;

public class DetectCapital_Leetcode_520 {

    //??
    public static boolean detectCapitalUse(String word) {

        if (word.length() <= 1)
            return true;

        int a = word.charAt(0) - 'A';

        //** if 1st char is lowercase, all chars should be lowercase
        if (a >= 32) {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) - 'A' < 32) return false;
            }
        }

        //** if 1st char is uppercase
        else {
            //** if 2nd char is uppercase, all char should be uppercase
            if (word.charAt(1) - 'A' < 32) {
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i) - 'A' >= 32) return false;
                }
            }

            //** if 2nd is lowercase, then all char should be lowercase
            else {
                for (int i = 1; i < word.length(); i++) {
                    if (word.charAt(i) - 'A' < 32) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
    }
}
