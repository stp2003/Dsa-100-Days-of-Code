package day32;

import java.util.Arrays;

public class DecodeXORedArray_Leetcode_1720 {

    //??
    public static int[] decode(int[] encoded, int first) {

        int[] res = new int[encoded.length + 1];
        res[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            res[i + 1] = encoded[i] ^ res[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decode(new int[]{1, 2, 3, 4, 5}, 3)));
    }
}
