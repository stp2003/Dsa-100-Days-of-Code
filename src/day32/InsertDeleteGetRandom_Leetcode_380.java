package day32;

import java.util.ArrayList;
import java.util.List;

public class InsertDeleteGetRandom_Leetcode_380 {

    //??
    private List<Integer> list;

    public void RandomizedSet() {
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (list.contains(val)) {
            return false;
        }
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (list.contains(val)) {
            list.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }

    public int getRandom() {
        int randomIdx = (int) (Math.random() * list.size());
        return list.get(randomIdx);
    }
}
