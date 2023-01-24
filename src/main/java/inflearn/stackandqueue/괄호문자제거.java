package inflearn.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            stack.push(ch);
            if (ch == ')') {
                while (stack.pop() != '(');
            }
        }

        String answer = "";
        for (char ch : stack) {
            answer += ch;
        }

        System.out.println(answer);
    }

}
