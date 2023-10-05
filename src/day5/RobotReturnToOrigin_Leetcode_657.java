package day5;

import java.util.Scanner;

public class RobotReturnToOrigin_Leetcode_657 {

    //??
    public static boolean judgeCircle(String moves) {

        int horizontal = 0, vertical = 0;

        for(char c : moves.toCharArray()) {

            if(c == 'U') horizontal++;
            else if(c == 'D') horizontal--;

            else if(c == 'R') vertical++;
            else if(c == 'L') vertical--;

        }
        return (horizontal == 0 && vertical == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();
        System.out.println(judgeCircle(moves));
    }
}
