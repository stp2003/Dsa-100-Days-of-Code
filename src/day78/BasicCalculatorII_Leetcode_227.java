package day78;

import java.util.Stack;

public class BasicCalculatorII_Leetcode_227 {

    //??
    public static int calculate(String s) {

        if (s == null || s.length() == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        int curr = 0;
        char operator = '+';

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i]))
                curr = curr * 10 + ch[i] - '0';
            if (!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length - 1) {
                if (operator == '+')
                    stack.push(curr);
                else if (operator == '-')
                    stack.push(-curr);
                else if (operator == '*')
                    stack.push(stack.pop() * curr);
                else if (operator == '/')
                    stack.push(stack.pop() / curr);
                curr = 0;
                operator = ch[i];

            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculate("3+2*2"));
    }
}
