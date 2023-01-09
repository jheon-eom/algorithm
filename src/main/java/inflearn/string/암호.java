package inflearn.string;

import java.util.Scanner;

public class 암호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        String answer = "";
        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7);
            temp = temp.replace("#", "1").replace("*", "0");
            int tempNum = Integer.parseInt(temp, 2);
            answer += (char) tempNum;
            str = str.substring(7);
        }

        System.out.println(answer);
    }
}
