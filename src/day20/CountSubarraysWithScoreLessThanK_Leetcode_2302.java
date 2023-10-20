package day20;

public class CountSubarraysWithScoreLessThanK_Leetcode_2302 {

    //??
    public static long countSubarrays(int[] A, long k) {

        long ans = 0, cur = 0;

        for (int j = 0, i = 0; j < A.length; ++j) {
            cur += A[j];
            while (cur * (j - i + 1) >= k)
                cur -= A[i++];
            ans += j - i + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[]{1, 2, 6, 3, 5}, 10));
    }
}
