package programmers.level2;

import java.util.Stack;

public class 올바른_괄호 {
    public static void main(String[] args) {
        올바른_괄호 T = new 올바른_괄호();
        boolean answer = T.solution("(())");
        System.out.println(answer);
    }

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
