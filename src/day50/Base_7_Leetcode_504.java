package day50;

public class Base_7_Leetcode_504 {

    //??
    public static String convertToBase7(int num) {

        return Integer.toString(num, 7);
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(5));
    }
}
