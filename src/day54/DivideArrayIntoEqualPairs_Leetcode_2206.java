package day54;

public class DivideArrayIntoEqualPairs_Leetcode_2206 {

    //??
    public static boolean divideArray(int[] nums) {

        int[] flag = new int[1001];
        for (int num : nums) {
            flag[num]++;
        }
        for (int j : flag) {
            if (j % 2 == 1)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(divideArray(new int[]{1, 2, 2, 3, 3, 1}));
    }
}
