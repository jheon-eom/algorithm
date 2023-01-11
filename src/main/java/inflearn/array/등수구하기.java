package inflearn.array;

import java.util.Scanner;

public class 등수구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        int[] ranks = new int[N];
        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) rank++;
            }
            ranks[i] = rank;
        }

        for (int r : ranks) System.out.print(r + " ");
    }

}
