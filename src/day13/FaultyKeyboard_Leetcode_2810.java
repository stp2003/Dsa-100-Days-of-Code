package day13;

public class FaultyKeyboard_Leetcode_2810 {

    //??
    public static String finalString(String s) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                ans.reverse();
            } else {
                ans.append(s.charAt(i));
            }
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        System.out.println(finalString("string"));
    }
}
