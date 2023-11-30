package day61;

public class FirstUniqueCharacterInAString_Leetcode_387 {

    //??
    public static int firstUniqChar(String s) {

        int ans = -1;
        for (char ch : s.toCharArray()) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return s.indexOf(ch);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
