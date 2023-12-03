package day64;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence_Leetcode_1455 {

    //??
    public static int isPrefixOfWord(String sentence, String searchWord) {

        String[] temp = sentence.split(" ");

        for (int i = 1; i <= temp.length; ++i) {
            if (temp[i - 1].startsWith(searchWord)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("kfghdj", "fdudjs"));
    }
}
