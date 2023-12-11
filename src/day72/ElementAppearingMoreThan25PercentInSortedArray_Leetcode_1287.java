package day72;

public class ElementAppearingMoreThan25PercentInSortedArray_Leetcode_1287 {

    //??
    public static int findSpecialInteger(int[] arr) {

        int quarter = arr.length / 4;
        for (int i = 0; i < arr.length - quarter; i++) {
            if (arr[i] == arr[i + quarter])
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1, 2, 3, 3, 3, 3, 3, 4, 5}));
    }
}
