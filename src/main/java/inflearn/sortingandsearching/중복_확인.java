package inflearn.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class 중복_확인 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 먼저 오름차순으로 정렬
//        for (int i = 0; i < n - 1; i++) {
//            int idx = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[idx] > arr[j]) {
//                    idx = j;
//                }
//            }
//            int tmp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = tmp;
//        }
        Arrays.sort(arr);

        // 배열의 양쪽만 조회해서 같은 숫자가 있으면 D 출력하고 브레이크
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("D");
                return;
            }
        }

        System.out.println("U");
    }

}
