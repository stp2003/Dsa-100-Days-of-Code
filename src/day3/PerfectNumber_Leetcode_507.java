package day3;

import java.util.Scanner;

public class PerfectNumber_Leetcode_507 {

    //??
    public static boolean checkPerfectNumber(int num) {

        int sum = 0;
        int n = num;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        return (n * 2) == sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(checkPerfectNumber(n));
    }
}
