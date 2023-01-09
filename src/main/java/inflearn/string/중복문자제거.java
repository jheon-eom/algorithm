package inflearn.string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 중복문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        /**
         * stream distinct() 사용
         */
        String answer = "";
        String[] strArr = str.split("");
        answer = Arrays.stream(strArr).distinct().collect(Collectors.joining());

        System.out.println(answer);

        /**
         * indexOf() 사용
         */
        String answer2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) answer2 += str.charAt(i);
        }

        System.out.println(answer2);

    }
}
