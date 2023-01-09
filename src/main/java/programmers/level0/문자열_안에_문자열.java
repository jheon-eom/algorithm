package programmers.level0;

import java.util.Collections;

public class 문자열_안에_문자열 {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
    }

    public static String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer = answer + my_string.charAt(i);
        }
        return answer;
    }
}
