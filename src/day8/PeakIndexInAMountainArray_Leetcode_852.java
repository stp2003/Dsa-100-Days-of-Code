package day8;

public class PeakIndexInAMountainArray_Leetcode_852 {

    //??
    public static int peakIndexInMountainArray(int[] arr) {

        int n = arr.length;

        int start = 0 , end = n - 1;

        //** simple binary search approach ->
        while(start < end) {

            int mid = start + (end - start) / 2;
            if(arr[mid + 1] > arr[mid]) {
                start = mid + 1;
            }

            else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0,5,6,9,2,3};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
