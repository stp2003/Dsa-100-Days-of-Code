package day127;

public class MinimumWindowSubstring_Leetcode_76 {

    //??
    public static String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] tCharCounters = new int['z' + 1];
        for (int i = 0; i < t.length(); i++) ++tCharCounters[t.charAt(i)];

        int windowLen = Integer.MAX_VALUE;
        int windowStart = -1;
        int unmatched = t.length();

        for (int start = 0, end = 0; end < s.length(); ) {
            if (tCharCounters[s.charAt(end)]-- > 0) --unmatched;
            end++;
            for (; unmatched == 0; ++start) {
                if (end - start < windowLen) {
                    windowStart = start;
                    windowLen = end - start;
                }
                if (tCharCounters[s.charAt(start)]++ == 0) unmatched++;
            }
        }

        return (windowStart == -1) ? "" : s.substring(windowStart, windowStart + windowLen);

    }

    public static void main(String[] args) {
        System.out.println(minWindow("abc", "abfg"));
    }
}
