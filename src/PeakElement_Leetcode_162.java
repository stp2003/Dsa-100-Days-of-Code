import java.util.Scanner;

public class PeakElement_Leetcode_162 {

    //?? findPeakElement ->
    public static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((i == 0 || nums[i - 1] < nums[i]) && (i == nums.length - 1 || nums[i] > nums[i + 1]))
                return i;
        }
        return 0;
    }

    //?? user input ->
    public static int[] TakeUserInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = TakeUserInput();
        System.out.println(findPeakElement(arr));

    }
}
