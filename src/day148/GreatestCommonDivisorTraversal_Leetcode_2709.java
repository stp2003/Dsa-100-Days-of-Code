package day148;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GreatestCommonDivisorTraversal_Leetcode_2709 {

    //??
    private int findRoot(int[] parent, int x) {
        return parent[x] == x ? x : (parent[x] = findRoot(parent, parent[x]));
    }

    private void union(int[] parent, int[] count, int x, int y) {
        x = findRoot(parent, x);
        y = findRoot(parent, y);
        if (x == y) {
            return;
        }
        if (count[x] < count[y]) {
            int temp = x;
            x = y;
            y = temp;
        }
        parent[y] = x;
        count[x] += count[y];
    }

    public boolean canTraverseAllPairs(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return true;
        }
        int[] parent = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
            count[i] = 1;
        }

        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            int num = nums[i];
            if (num == 1) {
                return false;
            }
            for (int d = 2; d * d <= num; ++d) {
                if (num % d == 0) {
                    if (factors.containsKey(d)) {
                        union(parent, count, i, factors.get(d));
                    } else {
                        factors.put(d, i);
                    }
                    while (num % d == 0) {
                        num /= d;
                    }
                }
            }
            if (num > 1) {
                if (factors.containsKey(num)) {
                    union(parent, count, i, factors.get(num));
                } else {
                    factors.put(num, i);
                }
            }
        }
        return count[findRoot(parent, 0)] == n;
    }
}
