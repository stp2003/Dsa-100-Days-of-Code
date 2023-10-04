package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz_Leetcode_412 {

    //??
    public static List<String> fizzBuzz(int n) {

        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else
                ans.add(String.valueOf(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fizzBuzz(n));
    }
}
