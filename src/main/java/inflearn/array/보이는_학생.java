package inflearn.array;

import java.util.Scanner;

public class 보이는_학생 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        int cnt = 1;
        int compare = arr[0];
        for (int n : arr) {
            if (n > compare) {
                cnt++;
                compare = n;
            }
        }

        System.out.println(cnt);
    }
}
