package day9;

import java.util.ArrayList;

public class DuplicateZeros_Leetcode_1089 {

    //??
    public static void duplicateZeros(int[] arr) {

        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int j : arr) {
            if (j != 0) {
                ans.add(j);
            } else {
                ans.add(0);
                ans.add(0);
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = ans.get(i);
        }
    }

    public static void main(String[] args) {

    }
}
