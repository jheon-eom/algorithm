package programmers.level1;

import java.util.Arrays;

public class 과일_장수 {
    public static void main(String[] args) {
        solution2(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        int[][] profits = new int[score.length / m][m];

        Arrays.sort(score);

        int index = (score.length / m) - 1;
        int index2 = (m - 1);
        for (int i = (score.length - 1); i >= (score.length % m); i--) {
            profits[index][index2] = score[i];
            index2--;
            if (index2 == -1) {
                index2 = (m - 1);
                index--;
            }
        }

        for (int i = 0; i < profits.length; i++) {
            answer += (profits[i][0] * m);
        }

        System.out.println(answer);
        return answer;
    }

    public static int solution2(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
        }

        return answer;
    }
}
