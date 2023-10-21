package day21;

public class GasStation_Leetcode_134 {

    //??
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int pos = 0, sum = 0, total = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0) {
                total += sum;
                sum = 0;
                pos = i + 1;
            }
        }
        total += sum;

        return total >= 0 ? pos : -1;
    }

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }
}
