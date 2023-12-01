package day62;

public class CountPrefixesOfAGivenString_Leetcode_2255 {

    //??
    public static int countPrefixes(String[] words, String s) {

        int count = 0;
        for (String str : words) {
            if (s.startsWith(str))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrefixes(new String[]{"a", "ab", "abc"}, "abc"));
    }
}
