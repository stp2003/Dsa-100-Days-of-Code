package day11;

public class PercentageOfLetterInString_Leetcode_2278 {

    //??
    public static int percentageLetter(String s, char letter) {

        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter) {
                count++;
            }
        }
        return (count * 100) / s.length();
    }

    public static void main(String[] args) {
        System.out.println(percentageLetter("abbbddde", 'd'));
    }
}
