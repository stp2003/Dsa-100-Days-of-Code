package day1;

import java.util.Scanner;

public class ExcelSheetColumnNumber_Leetcode_171 {

    //??
    public static int titleToNumber(String columnTitle) {
        int ans = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            ans = ans * 26 + columnTitle.charAt(i) - 'A' + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(titleToNumber(str));

    }
}
