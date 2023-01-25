package inflearn.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식_연산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Integer> stack = new Stack<>();
        int answer;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                String num = String.valueOf(c);
                stack.push(Integer.valueOf(num));
            }
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                int res;

                if (c == '+') {
                    res = lt + rt;
                }
                else if (c == '-') {
                    res = lt - rt;
                }
                else if (c == '*') {
                    res = lt * rt;
                }
                else {
                    res = lt / rt;
                }
                stack.push(res);
            }
        }

        answer = stack.pop();
        System.out.println(answer);
    }

}
