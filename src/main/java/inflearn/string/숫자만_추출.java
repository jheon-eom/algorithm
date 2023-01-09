package inflearn.string;

import java.util.Scanner;

public class 숫자만_추출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toUpperCase().replaceAll("[A-Z]", "");
        System.out.println(Integer.parseInt(str));

        /**
         * 아스키 코드
         * '0' = 48, '9' = 57
         */

        /**
         * Character.isDigit() 사용
         */
        String answer = "";
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) answer += ch;
        }

        System.out.println(Integer.parseInt(answer));
    }
}
