package day91;

public class RedistributeCharactersToMakeAllStringsEqual_Leetcode_1897 {

    //??
    public static boolean makeEqual(String[] words) {

        int[] res = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                //** counts no. of alphabets in String array ->
                //?? [2, 3, 3, 0, 0, ..., 0]
                res[c - 'a']++;
            }
        }

        for (int val : res) {
            if (val % words.length != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(makeEqual(new String[]{"abc", "aabc", "bc"}));
    }
}
