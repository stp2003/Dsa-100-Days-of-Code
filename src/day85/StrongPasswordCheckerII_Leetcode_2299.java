package day85;

public class StrongPasswordCheckerII_Leetcode_2299 {

    //??
    public static boolean strongPasswordCheckerII(String password) {

        if (password.length() < 8)
            return false;

        boolean lowercase = false, uppercase = false, digit = false, special = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch))
                digit = true;
            else if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch))
                    uppercase = true;
                else
                    lowercase = true;
            } else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+')
                special = true;
        }
        if (!lowercase || !uppercase || !digit || !special)
            return false;

        for (int i = 1; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("ufdkhjkhf37S!"));
    }
}
