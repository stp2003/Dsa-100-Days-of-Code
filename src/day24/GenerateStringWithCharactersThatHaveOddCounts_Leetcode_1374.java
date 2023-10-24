package day24;

public class GenerateStringWithCharactersThatHaveOddCounts_Leetcode_1374 {

    //??
    public static String generateTheString(int n) {

        StringBuilder res = new StringBuilder();

        if (n % 2 == 1) {
            res.append("x".repeat(n));
        } else {
            res.append("x".repeat(n - 1));
            res.append('y');
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateTheString(4));
    }
}
