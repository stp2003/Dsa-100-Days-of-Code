package day105;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram_Leetcode_1347 {

    //??
    public static int minSteps(String s, String t) {

        //** The indices 0 to 25 correspond to the characters 'a' to 'z' ->
        int[] sCount = new int[26];
        int[] tCount = new int[26];

        //?? when character found the count is incremented ->
        for (char ch : s.toCharArray()) {
            sCount[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            tCount[ch - 'a']++;
        }

        int totalSteps = 0;
        for (int i = 0; i < 26; i++) {
            totalSteps += Math.abs(sCount[i] - tCount[i]);
        }

        return totalSteps / 2;
    }

    public static void main(String[] args) {
        System.out.println(minSteps("bba", "aba"));
    }
}
