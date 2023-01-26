package inflearn.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른_괄호 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();

        boolean answer = true;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    answer = false;
                } else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            answer = false;
        }
        if (answer) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
