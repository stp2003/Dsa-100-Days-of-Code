package day48;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters_Leetcode_3 {

    //??
    public static int lengthOfLongestSubstring(String s) {

        int start = 0, end = 0, ans = 0;

        List<Character> list = new ArrayList<>();

        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                ans = Math.max(ans, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int ret = lengthOfLongestSubstring(str);
        System.out.println(ret);
    }
}
