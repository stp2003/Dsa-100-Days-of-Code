package day144;

public class BitwiseANDOfNumbersRange_Leetcode_201 {

    //??
    public static int rangeBitwiseAnd(int left, int right) {

        int ans = right;

        while (right > left) {

            ans = right & (right - 1);
            right = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5, 7));
    }
}
