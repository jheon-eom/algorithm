package inflearn.string;

import java.util.Scanner;

public class 문자_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = sc.next();
        int count = 0;

        str = str.toLowerCase();
        s = s.toLowerCase();
        char ch = s.charAt(0);
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }

        System.out.println(count);
    }
}
