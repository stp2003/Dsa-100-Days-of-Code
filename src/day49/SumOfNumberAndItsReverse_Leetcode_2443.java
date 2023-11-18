package day49;

public class SumOfNumberAndItsReverse_Leetcode_2443 {

    //??
    public static boolean sumOfNumberAndReverse(int num) {

        for (int i = 0; i <= num; i++) {
            int rev = 0;
            int temp = i;

            while (temp != 0) {
                int r = temp % 10;
                rev = rev * 10 + r;
                temp = temp / 10;
            }
            if ((i + rev) == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumberAndReverse(443));
    }
}
