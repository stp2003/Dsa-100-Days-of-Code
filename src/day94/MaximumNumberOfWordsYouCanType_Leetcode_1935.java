package day94;

public class MaximumNumberOfWordsYouCanType_Leetcode_1935 {

    //??
    public static int canBeTypedWords(String text, String brokenLetters) {

        String[] arr = text.split(" ");
        int count = 0;
        for (String s : arr) {
            for (int j = 0; j < brokenLetters.length(); j++) {
                if (s.contains(Character.toString(brokenLetters.charAt(j)))) {
                    count++;
                    break;
                }
            }
        }
        return (arr.length - count);
    }

    public static void main(String[] args) {
        System.out.println(canBeTypedWords("Leetcode", "e"));
    }
}
