package inflearn.dfsbfs;

import java.util.Scanner;

public class 섬나라_아일랜드_DFS {
    static int answer = 0;
    static int n = 0;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    private void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0; // 시작 지점을 0으로 초기화
                    DFS(i, j, board);
                }
            }
        }
    }

    private void DFS(int x, int y, int[][] board) {
        for (int i = 0; i < 8; i++) {
            int nx = dx[i];
            int ny = dy[i];
            if (nx >= 0 && nx <= n && ny >= 0 && ny <= n && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }
    }

    public static void main(String[] args) {
        섬나라_아일랜드_DFS T = new 섬나라_아일랜드_DFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        T.solution(arr);
        System.out.println(answer);
    }
}
