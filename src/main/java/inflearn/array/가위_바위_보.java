package inflearn.array;

import java.util.Scanner;

public class 가위_바위_보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int i = 0; i < N; i++) B[i] = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int aa = A[i];
            int bb = B[i];

            if (aa == bb) System.out.println("D");
            else if (aa == 1 && bb == 3) System.out.println("A");
            else if (aa == 3 && bb == 1) System.out.println("B");
            else if (aa > bb) System.out.println("A");
            else System.out.println("B");
        }
    }
}
