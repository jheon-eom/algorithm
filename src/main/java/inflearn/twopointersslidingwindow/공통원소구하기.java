package inflearn.twopointersslidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 공통원소구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < nArr.length; i++) nArr[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < mArr.length; i++) mArr[i] = sc.nextInt();

        List<Integer> answer = new ArrayList<>();
        Arrays.sort(nArr);
        Arrays.sort(mArr);

        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if (nArr[p1] == mArr[p2]) {
                answer.add(nArr[p1]);
                p1++;
                p2++;
            }
            else if (nArr[p1] > mArr[p2]) p2++;
            else p1++;
        }

        for (Integer integer : answer) System.out.print(integer + " ");
    }
}
