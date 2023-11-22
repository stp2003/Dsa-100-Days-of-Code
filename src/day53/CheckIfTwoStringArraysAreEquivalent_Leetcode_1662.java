package day53;

public class CheckIfTwoStringArraysAreEquivalent_Leetcode_1662 {

    //??
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        for (String s : word1) {
            stringBuilder1.append(s);
        }
        for (String s : word2) {
            stringBuilder2.append(s);
        }
        return stringBuilder1.toString().contentEquals(stringBuilder2);

    }

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"a", "bc"}, new String[]{"ab", "c"}));
    }
}
