package inflearn.string;

import java.util.Scanner;

public class 가장_짧은_문자거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);

        int[] answer = new int[s.length()];

        int p = 101;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) p = 0;
            else p++;
            answer[i] = p;
        }

        p = 101;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else p++;

            answer[i] = Math.min(answer[i], p);
        }

        for (int i : answer) System.out.print(i + " ");
    }
}
