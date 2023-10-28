package day28;

public class CountIntegersWithEvenDigitSum_Leetcode_2180 {

    //??
    public static int countEven(int num) {

        int temp = num;
        int sum = 0;

        while (temp != 0) {
            sum += temp % 10;
            temp = temp / 10;
        }

        return sum % 2 == 0 ? num / 2 : (num - 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(countEven(4));
    }
}
