package day34;

public class CheckIfNumberIsSumOfPowersOfThree_Leetcode_1780 {

    //??
    public static boolean checkPowersOfThree(int n) {

        while (n > 0) {

            if (n % 3 == 2)
                return false;

            else
                n = n / 3;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(12));
    }
}
