package day106;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose_Leetcode_1657 {

    //??
    public static boolean closeStrings(String word1, String word2) {

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (char letter : word1.toCharArray())
            arr1[letter - 'a']++;

        for (char letter : word2.toCharArray())
            arr2[letter - 'a']++;

        //??  If one array has a non-zero frequency for a character while the other has zero, or vice versa,
        //?? it means the characters are not the same, then return false.
        for (int i = 0; i < 26; i++) {
            if (arr1[i] == 0 && arr2[i] != 0)
                return false;
            if (arr1[i] != 0 && arr2[i] == 0)
                return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(closeStrings("abcd", "adbc"));
    }
}
