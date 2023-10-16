package day16;

public class ShuffleString_Leetcode_1528 {

    //??
    public static String restoreString(String s, int[] indices) {

        char[] res = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }

        return new String(res);
    }

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 3, 2, 1, 7, 8}));
    }
}
