package day26;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers_Leetcode_728 {

    //??
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isSelfDividing(int num) {
        for (char c : String.valueOf(num).toCharArray()) {
            if (c == '0' || num % (c - '0') > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(10, 40));
    }
}
