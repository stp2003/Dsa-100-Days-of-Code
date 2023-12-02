package day63;

public class CheckIfStringIsAPrefixOfArray_Leetcode_1961 {

    //??
    public static boolean isPrefixString(String s, String[] words) {

        StringBuilder stringBuilder = new StringBuilder();

        for (String str : words) {
            stringBuilder.append(str);
            if (stringBuilder.toString().startsWith(s) && s.length() >= stringBuilder.toString().length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixString("a", new String[]{"aa,aaa"}));
    }
}
