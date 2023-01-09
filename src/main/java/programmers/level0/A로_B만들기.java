package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class A로_B만들기 {
    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
    }

    public static int solution(String before, String after) {
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        return Arrays.toString(beforeArr).equals(Arrays.toString(afterArr)) ? 1 : 0;
    }
}
