package day83;

public class MinimumChangesToMakeAlternatingBinaryString_Leetcode_1758 {

    //??
    public static int minOperations(String s) {

        int count0 = 0, count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            //?? If i % 2 is 0, the expected character is '0', and if i % 2 is 1the expected character is '1'
            if (s.charAt(i) - '0' != i % 2)
                count0++;
            else
                count1++;
        }
        return Math.min(count1, count0);
    }

    public static void main(String[] args) {
        System.out.println(minOperations("0011"));
    }
}
