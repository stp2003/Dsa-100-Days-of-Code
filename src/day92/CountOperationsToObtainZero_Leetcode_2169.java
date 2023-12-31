package day92;

public class CountOperationsToObtainZero_Leetcode_2169 {

    //??
    public static int countOperations(int num1, int num2) {
        if (num1 == 0 || num2 == 0)
            return 0;
        int count = 1;
        while (num1 != num2) {
            if (num1 >= num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOperations(2, 3));
    }
}
