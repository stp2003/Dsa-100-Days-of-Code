package day11;

public class FinalValueOfVariableAfterPerformingOperations_Leetcode_2011 {

    //??
    public static int finalValueAfterOperations(String[] operations) {

        int sum = 0;

        for (String operation : operations) {

            if (operation.equals("++X") || operation.equals("X++")) {
                sum++;
            } else {
                sum--;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
    }
}
