package day10;

import java.util.Scanner;

public class NimGame_Leetcode_292 {

    //??
    public static boolean canWinNim(int n) {

        if(n < 4)
            return true;

        return n % 4 != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(canWinNim(n));
    }
}
