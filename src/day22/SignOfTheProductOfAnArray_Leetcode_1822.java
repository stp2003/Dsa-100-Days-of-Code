package day22;

public class SignOfTheProductOfAnArray_Leetcode_1822 {

    //??
    public static int arraySign(int[] nums) {

        int flag = 1;
        for (int num : nums) {
            if (num > 0) {
                flag = flag;
            } else if (num < 0) {
                flag *= -1;
            } else {
                flag *= 0;
            }
        }
        return Integer.compare(flag, 0);
    }

    public static void main(String[] args) {
        System.out.println(arraySign(new int[]{-1, 2, -3, 4, 8, -9}));
    }
}
