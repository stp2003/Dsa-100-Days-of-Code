package day60;

public class SumOfDigitsOfStringAfterConvert_Leetcode_1945 {

    //??
    public static int getLucky(String s, int k) {

        int sum = 0;
        char[] charArray = s.toCharArray();

        for (char ch : charArray) {
            sum += sumOfDigit(ch - 'a' + 1);
        }
        while (k - 1 > 0) {
            sum = sumOfDigit(sum);
            k--;
        }
        return sum;
    }

    public static int sumOfDigit(int num) {
        int res = 0;
        while (num > 0) {
            int temp = num % 10;
            res += temp;
            num /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getLucky("iiii", 1));
    }
}
