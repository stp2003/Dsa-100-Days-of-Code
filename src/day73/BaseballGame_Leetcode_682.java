package day73;

import java.util.Stack;

public class BaseballGame_Leetcode_682 {

    //??
    public static int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (String operation : operations) {
            switch (operation) {
                case "D" -> {
                    int res = stack.peek() * 2;
                    stack.add(res);
                    ans += res;
                }
                case "C" -> ans -= stack.pop();
                case "+" -> {
                    int res = stack.get(stack.size() - 2) + stack.peek();
                    stack.add(res);
                    ans += res;
                }
                default -> {
                    int res = Integer.parseInt(operation);
                    stack.add(res);
                    ans += res;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }
}
