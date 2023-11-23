package day54;

public class CheckIfNAndItsDoubleExist_Leetcode_1346 {

    //??
    public static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j])
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{1, 2, 2, 3, 3, 1}));
    }
}
