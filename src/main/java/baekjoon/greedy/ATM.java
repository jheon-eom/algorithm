package baekjoon.greedy;

import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int totalTime = 0;
        int waitTime = 0;
        for (int i = 0; i < N; i++) {
            waitTime += arr[i];
            totalTime += waitTime;
        }

        System.out.println(totalTime);
    }
}
