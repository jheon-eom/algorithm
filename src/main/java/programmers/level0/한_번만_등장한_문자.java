package programmers.level0;

import java.util.Arrays;

public class 한_번만_등장한_문자 {
    public static void main(String[] args) {
        solution("abdc");
    }

    public static String solution(String s) {
        String[] strArr = s.split("");
        String answer = "";

        Arrays.sort(strArr);
        for (int i = 0; i < strArr.length; i++) {
            int index = 0;
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    index++;
                }
                if (index > 1) {
                    break;
                }
            }
            if (index == 1) {
                answer += strArr[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
}


