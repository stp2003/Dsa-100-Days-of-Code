package day5;

import java.util.Scanner;

public class FurthestPointFromOrigin_Leetcode_2833 {

    //??
    public static int furthestDistanceFromOrigin(String moves) {

        int countLeft = 0, countRight = 0, countSpace = 0;

        for (int i = 0; i < moves.length(); i++) {

            if (moves.charAt(i) == 'L') countLeft++;

            else if (moves.charAt(i) == 'R') countRight++;

            else countSpace++;
        }

        if (countRight > countLeft)
            return countRight + countSpace - countLeft;

        return countLeft + countSpace - countRight;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        System.out.println(furthestDistanceFromOrigin(moves));
    }
}
