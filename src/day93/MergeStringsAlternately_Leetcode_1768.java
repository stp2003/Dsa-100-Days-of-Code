package day93;

public class MergeStringsAlternately_Leetcode_1768 {

    //??
    public static String mergeAlternately(String word1, String word2) {

        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {

            //** simply travel through both words and alternatively put one word from each ->
            if (i < word1.length()) {
                stringBuilder.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                stringBuilder.append(word2.charAt(i));
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ABC", "PQR"));
    }
}
