package day69;

public class BackspaceStringCompare_Leetcode_844 {

    //??
    public static boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }

    public static String compare(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] res = str.toCharArray();

        for (char c : res) {
            //** If the current character i is an #, remove the last element from the ans list.
            if (c == '#') {
                if (stringBuilder.length() > 0) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }

            } else {
                //** If the current character i is not an #, add it to the end of the ans list.
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
    }
}
