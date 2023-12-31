package day92;

public class NumberOfStepsToReduceANumberToZero_Leetcode_1342 {

    //??
    public static int numberOfSteps(int num) {

        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(6));
    }
}
