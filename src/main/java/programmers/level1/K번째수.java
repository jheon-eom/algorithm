package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class K번째수 {
    public static void main(String[] args) {
        int[][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(new int[] {1, 5, 2, 6, 3, 7, 4}, commands);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            List<Integer> tempArr = new ArrayList<>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                tempArr.add(array[j]);
            }
            tempArr.sort(Integer::compareTo);
            answer[i] = tempArr.get(commands[i][2] - 1);
        }

        return answer;
    }
}
