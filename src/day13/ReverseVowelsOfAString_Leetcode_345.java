package day13;

public class ReverseVowelsOfAString_Leetcode_345 {

    //??
    public static String reverseVowels(String s) {

        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {

            //?? loop will continue until there is a vowel ->
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }
            // Swapping ->
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }
        return new String(word);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
