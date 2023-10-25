package day25;

public class CountTheDigitsThatDivideANumber_Leetcode_2520 {

    //??
    public static int countDigits(int num) {

        int count = 0;
        int x = num;

        while (x != 0) {
            int t = x % 10;

            if (t != 0 && num % t == 0) count++;

            x /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }
}
