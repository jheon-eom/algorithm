package inflearn.hashmaptreeset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째_큰_수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = -1;
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    tSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : tSet) {
            if (cnt == k - 1) {
                answer = x;
            }
            cnt++;
        }

        System.out.println(answer);
    }

}
