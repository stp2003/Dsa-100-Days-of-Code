package day109;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences_Leetcode_1207 {

    //??
    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(map.values());
        return (set.size() == map.size());
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1, 23, 5, 6}));
    }
}
