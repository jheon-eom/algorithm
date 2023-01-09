package inflearn.string;

import java.util.Scanner;

public class 대소문자_변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";

        for (char ch : str.toCharArray()) {
            if (ch >= 97 && ch <= 122) answer += (char) (ch - 32);
            else answer += (char) (ch + 32);
        }

        System.out.println(answer);
    }
}
