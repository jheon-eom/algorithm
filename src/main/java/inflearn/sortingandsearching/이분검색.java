package inflearn.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // 이분 검색
        int lt = 0;
        int rt = arr.length - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (m == arr[mid]) {
                System.out.println(mid + 1);
                return;
            } else {
                if (m > arr[mid]) {
                    lt = mid + 1;
                } else {
                    rt = mid - 1;
                }
            }
        }
    }

}
