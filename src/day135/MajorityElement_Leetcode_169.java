package day135;

public class MajorityElement_Leetcode_169 {

    //??
    public static int majorityElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count > arr.length / 2) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 8, 9, 6, 5}));
    }
}
