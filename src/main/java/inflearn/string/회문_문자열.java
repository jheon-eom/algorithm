package inflearn.string;

import java.util.Scanner;

public class 회문_문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toUpperCase();

        /**
         * for문 사용
         */
//        int temp = str.length() - 1;
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(temp)) {
//                System.out.println("NO");
//                return;
//            }
//            temp--;
//        }
//
//        System.out.println("YES");

        /**
         * StringBuilder 클래스의 reverse() 메서드 사용
         */
        String reversStr = new StringBuilder(str).reverse().toString();

        if (reversStr.equals(str)) System.out.println("YES");
        else System.out.println("NO");
    }
}
