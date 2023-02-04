package inflearn.recursivetreegraph;

import java.util.Scanner;

public class 재귀함수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        재귀함수 재귀함수 = new 재귀함수();
        재귀함수.DFS(3);
    }

    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

}
