package programmers.level1;

import java.nio.file.StandardCopyOption;

public class 다트_게임 {
    public static void main(String[] args) {
        solution("1D2S#10S");
    }

    public static int solution(String dartResult) {
        int answer = 0;
        String[] splitTheDartResult = dartResult.split("");
        int score = 0;
        int[] scores = new int[3];
        int idx = 0;

        for (int i = 0; i < splitTheDartResult.length; i++) {
            if ("0123456789".contains(splitTheDartResult[i])) {
                if (score == 10) continue;
                score = splitTheDartResult[i + 1].equals("0") ? 10 : Integer.parseInt(splitTheDartResult[i]);
            } else if ("SDT".contains(splitTheDartResult[i])) {
                if (splitTheDartResult[i].equals("S")) score = (int) Math.pow(score, 1);
                else if (splitTheDartResult[i].equals("D")) score = (int) Math.pow(score, 2);
                else score = (int) Math.pow(score, 3);
                scores[idx] = score;
                idx++;
                score = 0;
            } else {
                if (splitTheDartResult[i].equals("*")) {
                    if (i == 2) scores[0] *= 2;
                    else {
                        scores[idx - 2] *= 2;
                        scores[idx - 1] *= 2;
                    }
                } else scores[idx - 1] *= (-1);
            }
        }

        for (Integer i : scores) answer += i;

        return answer;
    }
}
