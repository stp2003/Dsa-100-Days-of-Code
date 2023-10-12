package day12;

import java.util.Arrays;

public class AssignCookies_Leetcode_455 {

    //??
    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // cookies
        int j = 0; // children
        int count = 0;

        while (i < g.length && j < s.length) {
            if (s[j] < g[i]) {
                j++;
            } else {
                i++;
                j++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }
}
