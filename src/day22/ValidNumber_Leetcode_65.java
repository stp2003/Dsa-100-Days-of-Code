package day22;

public class ValidNumber_Leetcode_65 {

    //??
    public static boolean isNumber(String s) {

        boolean digitSeen = false, eSeen = false, dotSeen = false;
        int countPlusMinus = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //** digit
            if (Character.isDigit(ch)) {
                digitSeen = true;
            }

            //** minus/plus
            else if (ch == '+' || ch == '-') {
                if (countPlusMinus == 2) {
                    return false;
                }

                if (i > 0 && (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')) {
                    return false;
                }

                if (i == s.length() - 1) {
                    return false;
                }

                countPlusMinus++;
            }

            //** dot
            else if (ch == '.') {
                if (eSeen || dotSeen) {
                    return false;
                }

                if (i == s.length() - 1 && !digitSeen) {
                    return false;
                }

                dotSeen = true;
            }

            //** e/E
            else if (ch == 'e' || ch == 'E') {
                if (eSeen || !digitSeen || i == s.length() - 1) {
                    return false;
                }
                eSeen = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("+782e14"));
    }
}
