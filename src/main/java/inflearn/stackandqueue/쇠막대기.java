package inflearn.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (s.charAt(i - 1) == '(') { // 레이저
                    stack.pop();
                    answer += stack.size();
                } else { // 막대기 끝
                    stack.pop();
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

}
