package programmers.level2;

import java.util.Stack;

public class 짝지어_제거하기 {

    public static void main(String[] args) {
        짝지어_제거하기 T = new 짝지어_제거하기();
        int answer = T.solution("baabaa");
        System.out.println(answer);
    }

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ch == stack.peek()) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
