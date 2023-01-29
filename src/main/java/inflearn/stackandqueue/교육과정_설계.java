package inflearn.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정_설계 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s1.length(); i++) {
            queue.offer(s1.charAt(i));
        }

        String answer = "YES";
        for (int i = 0; i < s2.length(); i++) {
            if (queue.contains(s2.charAt(i))) {
                if (queue.poll() != s2.charAt(i)) {
                    answer = "NO";
                    break;
                }
            }
        }
        if (!queue.isEmpty()) {
            answer = "NO";
        }

        System.out.println(answer);
    }

}
