package day17;

public class ThreeConsecutiveOdds_Leetcode_1550 {

    //??
    public static boolean threeConsecutiveOdds(int[] arr) {

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{2, 5, 6, 8, 1, 3, 7}));
    }
}
