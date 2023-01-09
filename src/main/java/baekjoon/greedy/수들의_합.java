package baekjoon.greedy;

import java.util.Scanner;

public class 수들의_합 {
    public static void main(String[] args) {
        long N = new Scanner(System.in).nextLong();
        long sum = 0;
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (sum > N) {
                break;
            } else {
                sum += i;
                count++;
            }
        }

        System.out.println(count - 1);
    }
}

