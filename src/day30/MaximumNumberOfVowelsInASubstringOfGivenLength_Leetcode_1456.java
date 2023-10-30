package day30;

public class MaximumNumberOfVowelsInASubstringOfGivenLength_Leetcode_1456 {

    //??
    public static int maxVowels(String s, int k) {
        int left = 0, right = 0, res, window = 0;
        for (; right < k; right++) {
            window += isVowel(s.charAt(right));
        }
        res = window;
        while (right < s.length()) {
            window -= isVowel(s.charAt(left++));
            window += isVowel(s.charAt(right++));
            res = Math.max(res, window);
        }
        return res;
    }

    public static int isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("aeiou", 2));
    }
}
