package day34;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences_Leetcode_1941 {

    //??
    public static boolean areOccurrencesEqual(String s) {

        int[] res = new int[26];

        for (int i = 0; i < s.length(); i++) {
            res[s.charAt(i) - 'a']++;
        }
        int x = 0;
        for (int i : res) {
            if (i != 0 && x == 0) {
                x = i;
            } else if (i != 0) {
                if (x != i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("aabbcc"));
    }
}
