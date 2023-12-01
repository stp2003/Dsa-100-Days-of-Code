package day62;

public class FirstLetterToAppearTwice_Leetcode_2351 {

    //??
    public static char repeatedCharacter(String s) {

        for (int i = 1; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != i) {
                return s.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("leetcode"));
    }
}
