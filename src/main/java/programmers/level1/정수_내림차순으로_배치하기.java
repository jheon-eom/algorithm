package programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr);
        String[] strArr2 = new String[strArr.length];

        int index = 0;
        for (int i = strArr.length - 1; i >= 0; i--) {
            strArr2[index] = strArr[i];
            index++;
        }

        return Long.parseLong(Arrays.stream(strArr2).collect(Collectors.joining()));
    }
}
