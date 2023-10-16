package day16;

import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII_Leetcode_119 {

    //??
    public static List<Integer> getRow(int rowIndex) {

        Integer[] res = new Integer[rowIndex + 1];

        Arrays.fill(res, 0);

        res[0] = 1;

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                res[j] = res[j] + res[j - 1];
            }
        }
        return Arrays.asList(res);
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
