package inflearn.array;

import java.util.Scanner;

public class 점수계산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        int answer = 0;
        int score = 0;
        for (int ox : arr) {
            if (ox == 1) {
                score++;
                answer += score;
            }
            else score = 0;
        }

        System.out.println(answer);
    }

}
