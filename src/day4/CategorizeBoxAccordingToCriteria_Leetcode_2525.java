package day4;

import java.util.Scanner;

public class CategorizeBoxAccordingToCriteria_Leetcode_2525 {

    //??
    public static String categorizeBox(int length, int width, int height, int mass) {

        if (isBulky(length, width, height) && mass >= 100) {
            return "Both";
        } else if (!(isBulky(length, width, height)) && mass < 100) {
            return "Neither";
        } else if (!(isBulky(length, width, height)) && mass >= 100) {
            return "Heavy";
        } else {
            return "Bulky";
        }
    }

    private static boolean isBulky(int length, int width, int height) {

        long volume = (long) length * (long) width * (long) height;

        if (Math.max(length, Math.max(width, height)) >= 10000) {
            return true;
        }

        return volume >= 1000000000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(categorizeBox(l, w, h, m));
    }
}
