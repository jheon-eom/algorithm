package programmers.level0;

public class _2차원으로_만들기 {
    public static void main(String[] args) {

    }

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int count = 0;

        for (int i = 0; i < num_list.length / 2; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[count];
                count++;
            }
        }

        return answer;
    }
}
