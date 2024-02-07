package day130;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency_Leetcode_451 {

    //??
    public static String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        List<Character>[] bucket = new ArrayList[s.length() + 1];
        for (Character c : map.keySet()) {
            if (bucket[map.get(c)] == null)
                bucket[map.get(c)] = new ArrayList<>();
            bucket[map.get(c)].add(c);
        }

        StringBuilder result = new StringBuilder();
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (Character c : bucket[i])
                    result.append(String.valueOf(c).repeat(i));
            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(frequencySort("abc"));
    }
}
