package day33;

public class KthMissingPositiveNumber_Leetcode_1539 {

    //??
    public static int findKthPositive(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] - (mid + 1) >= k)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low + k;
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{1, 2, 3, 4, 5}, 2));
    }
}
