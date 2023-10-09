package day9;

import java.util.Scanner;

public class Maximum69Number_Leetcode_1323 {

    //??
    public static int maximum69Number(int num) {

        String ans = String.valueOf(num);

        ans = ans.replaceFirst("6", "9");    // it replaces first 6 with 9

        return Integer.parseInt(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(maximum69Number(n));
    }
}
