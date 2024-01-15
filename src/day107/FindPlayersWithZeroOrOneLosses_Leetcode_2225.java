package day107;

import java.util.ArrayList;
import java.util.List;

public class FindPlayersWithZeroOrOneLosses_Leetcode_2225 {

    //??
    public static List<List<Integer>> findWinners(int[][] matches) {

        int[] losses = new int[100001];

        for (int[] match : matches) {
            //** match[0] represents the player who won the match, and match[1] represents the player who lost the match.
            int winner = match[0];
            int loser = match[1];

            //?? If the losses array at the index of the winner is 0, it means the winner has not suffered any losses so far.
            //?? In this case, set their losses to -1.
            if (losses[winner] == 0) {
                losses[winner] = -1;
            }

            //?? f the loser's losses are currently recorded as -1, it means the loser has already won at least one match. In this case, set their losses to 1.
            //?? Otherwise, if the loser already has losses recorded, increment the count by 1.
            if (losses[loser] == -1) {
                losses[loser] = 1;
            } else {
                losses[loser]++;
            }
        }

        List<Integer> zeroLossPlayers = new ArrayList<>();
        List<Integer> oneLossPlayers = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i < losses.length; i++) {
            if (losses[i] == -1) {
                zeroLossPlayers.add(i);
            } else if (losses[i] == 1) {
                oneLossPlayers.add(i);
            }
        }

        result.add(zeroLossPlayers);
        result.add(oneLossPlayers);

        return result;

    }

    public static void main(String[] args) {
        System.out.println(findWinners(new int[][]{{1, 2}, {2, 6}}));
    }
}
