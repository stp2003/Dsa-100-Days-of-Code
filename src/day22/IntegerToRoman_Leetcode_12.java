package day22;

public class IntegerToRoman_Leetcode_12 {

    //??
    public static String intToRoman(int num) {

        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = values.length - 1; i >= 0 && num > 0; i--) {
            while (num > values[i]) {
                num -= values[i];
                stringBuilder.append(roman[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }
}
