package inflearn.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class 크레인_인형뽑기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        /**
         * 풀이 시작
         */
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            int pos = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][pos] != 0) {
                    int doll = board[j][pos];
                    board[j][pos] = 0;

                    if (!stack.isEmpty() && doll == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }
                    else {
                        stack.push(doll);
                    }
                    break;
                }
            }
        }

        System.out.println(answer);
    }

}
