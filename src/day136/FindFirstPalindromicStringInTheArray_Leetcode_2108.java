package day136;

public class FindFirstPalindromicStringInTheArray_Leetcode_2108 {

    //??
    public static String firstPalindrome(String[] words) {

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word).reverse();
            if (word.contentEquals(reversed)) {
                return word;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"fjd", "dskjgjf"}));
    }
}
