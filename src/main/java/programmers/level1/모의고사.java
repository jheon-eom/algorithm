package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {

    }

    public static int[] solution(int[] answers) {
        int[] giveUpMath1 = {1, 2, 3, 4, 5};
        int[] giveUpMath2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] giveUpMath3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == giveUpMath1[i % 5]) scores[0]++;
            if (answers[i] == giveUpMath2[i % 8]) scores[1]++;
            if (answers[i] == giveUpMath3[i % 10]) scores[2]++;
        }

        int highScore = 0;
        for (int i = 0; i < 3; i++) {
            if (scores[i] >= highScore) highScore = scores[i];
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == highScore) list.add(i + 1);
        }

        list.sort(Integer::compareTo);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
