package inflearn.sortingandsearching;

import java.util.Scanner;

public class Least_Recently_Used {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] cache = new int[s];
        for (int x : arr) {
            int idx = -1;
                // 먼저 캐시 히트인지 미스인지 확인
                for (int i = 0; i < cache.length; i++) {
                    if (x == cache[i]) {
                        idx = i;
                    }
                }
                // 캐시 히트
                if (idx != -1) {
                    for (int j = idx; j > 0; j--) {
                        cache[j] = cache[j - 1];
                    }
                    // 캐시 미스
                } else {
                    for (int k = cache.length - 1; k > 0; k--) {
                        cache[k] = cache[k - 1];
                    }
                }
                cache[0] = x;
            }

        for (int i : cache) {
            System.out.print(i + " ");
        }
    }
}
