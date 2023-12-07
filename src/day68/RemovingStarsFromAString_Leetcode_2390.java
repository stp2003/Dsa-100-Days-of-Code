package day68;

public class RemovingStarsFromAString_Leetcode_2390 {

    //??
    public static String removeStars(String s) {

        StringBuilder str = new StringBuilder();

        //** If the current character i is an asterisk, remove the last element from the ans list.
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                str.deleteCharAt(str.length() - 1);
            } else {
                //** If the current character i is not an asterisk, add it to the end of the ans list.
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
}
