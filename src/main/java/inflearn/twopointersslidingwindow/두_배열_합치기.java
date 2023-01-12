package inflearn.twopointersslidingwindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 두_배열_합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) nArr[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) mArr[i] = sc.nextInt();

        List<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < nArr.length && p2 < mArr.length) {
            if (nArr[p1] > mArr[p2]) answer.add(mArr[p2++]);
            else answer.add(nArr[p1++]);
        }

        while (p1 < nArr.length) answer.add(nArr[p1++]);
        while (p2 < mArr.length) answer.add(mArr[p2++]);

        answer.forEach(s -> System.out.print(s + " "));
    }
}
