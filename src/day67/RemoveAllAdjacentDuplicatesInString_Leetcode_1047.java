package day67;

public class RemoveAllAdjacentDuplicatesInString_Leetcode_1047 {

    //??
    public static String removeDuplicates(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (stringBuilder.isEmpty() || stringBuilder.charAt(stringBuilder.length() - 1) != c) {
                stringBuilder.append(c);
            } else {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
