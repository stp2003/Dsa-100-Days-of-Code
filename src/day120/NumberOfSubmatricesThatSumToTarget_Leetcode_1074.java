package day120;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubmatricesThatSumToTarget_Leetcode_1074 {

    //??
    public static int numSubmatrixSumTarget(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;
        int res = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        for (int start = 0; start < col; start++) {
            for (int end = start; end < col; end++) {
                int subMatrixSum = 0;

                Map<Integer, Integer> countElm = new HashMap<Integer, Integer>();
                countElm.put(0, 1);

                for (int[] ints : matrix) {
                    int prefixSum = start == 0 ? 0 : ints[start - 1];
                    subMatrixSum += ints[end] - prefixSum;

                    if (countElm.containsKey(subMatrixSum - target))
                        res += countElm.get(subMatrixSum - target);

                    int r = countElm.getOrDefault(subMatrixSum, 0);
                    countElm.put(subMatrixSum, r + 1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numSubmatrixSumTarget(new int[][]{{1, 2, 3}, {5566, 556}}, 5));
    }
}
