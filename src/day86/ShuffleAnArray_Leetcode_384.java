package day86;

import java.util.Random;

public class ShuffleAnArray_Leetcode_384 {

    //??
    public int[] nums;
    public Random random;

    public void Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        int[] shuffle = nums.clone();
        for (int i = nums.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            //** swap nums
            int temp = shuffle[i];
            shuffle[i] = shuffle[index];
            shuffle[index] = temp;
        }
        return shuffle;
    }

    public static void main(String[] args) {

    }
}
