package day4;

import java.util.LinkedList;
import java.util.List;

public class AddToArrayOfInteger_Leetcode_989 {

    //??
    public static List<Integer> addToArrayForm(int[] num, int k) {

        LinkedList<Integer> ll = new LinkedList<>();
        int n = num.length - 1;

        while (n >= 0 || k != 0) {
            if (n >= 0) {
                k += num[n];
                n--;
            }
            ll.addFirst(k % 10);
            k /= 10;
        }
        return ll;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 0, 0};
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }
}
