package day65;

import java.util.ArrayList;
import java.util.List;

public class FindThePeaks_Leetcode_2951 {

    //??
    public static List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> ans = new ArrayList<>();

        //** start from 2 element and go till second last as 1st and last can't be peak.
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i - 1] < mountain[i] && mountain[i] > mountain[i + 1]) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findPeaks(new int[]{1, 4, 3, 8, 5}));
    }
}
