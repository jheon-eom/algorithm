package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 푸드_파이트_대회 {
    public static void main(String[] args) {
        solution2(new int[] {1 ,7 , 1, 2});
    }

    public static String solution(int[] food) {
        String answer1 = "";
        String answer2 = "";
        List<Integer> foodArr = new ArrayList<>();

        for (int i = food.length - 1; i >= 0; i--) {
            int cnt = food[i] / 2;
            for (int j = 0; j < cnt; j++) foodArr.add(i);
        }

        for (Integer i : foodArr) answer1 += String.valueOf(i);

        foodArr.sort(Integer::compareTo);
        for (Integer i : foodArr) answer2 += String.valueOf(i);

        return answer2 + "0" + answer1;
    }

    public static String solution2(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) answer = i + answer + i;
        }

        return answer;
    }
}
