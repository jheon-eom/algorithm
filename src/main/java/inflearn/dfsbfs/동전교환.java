package inflearn.dfsbfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {
    static int n;
    static int m;
    static Integer[] arr;
    static int answer = 500;

    static void DFS(int L, int sum, Integer[] arr) {
        if (sum > m || L >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
