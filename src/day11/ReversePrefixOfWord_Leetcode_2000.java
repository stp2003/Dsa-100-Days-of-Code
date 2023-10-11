package day11;

public class ReversePrefixOfWord_Leetcode_2000 {

    //??
    public static String reversePrefix(String word, char ch) {

        StringBuilder ans = new StringBuilder();

        if (word.contains(String.valueOf(ch))) {

            int rev = word.indexOf(ch);

            for (int i = rev; i >= 0; i--) {
                ans.append(String.valueOf(word.charAt(i)));
            }

            ans.append(word.substring(rev + 1));

            return ans.toString();

        } else
            return word;

    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdef", 'd'));
    }

}
