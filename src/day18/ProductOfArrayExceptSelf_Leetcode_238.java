package day18;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_Leetcode_238 {

    //??
    public static int[] productExceptSelf(int[] nums) {

        int prefixProduct = 1;
        int suffixProduct = 1;

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
