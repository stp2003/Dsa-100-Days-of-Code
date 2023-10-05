package day5;

import java.util.ArrayList;
import java.util.List;

public class FindSmallestLetterGreaterThanTarget_Leetcode_744 {

    //??
    public static char nextGreatestLetter(char[] letters, char target) {

        List<Character> ans = new ArrayList<>();
        for(char i : letters) {
            ans.add(i);
        }

        int index = 0;
        for(int i = 0; i < ans.size(); i++) {
            if(ans.get(i) > target) {
                index = i;
                break;
            }
        }
        return ans.get(index);
    }

    public static void main(String[] args) {
        char[] letters = new char[] {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }
}
