package day64;

public class CountingWordsWithAGivenPrefix_Leetcode_2185 {

    //??
    public static int prefixCount(String[] words, String pref) {

        int count = 0;

        for (String word : words) {
            if (word.startsWith(pref))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(prefixCount(new String[]{"attension", "attendance"}, "at"));
    }
}
