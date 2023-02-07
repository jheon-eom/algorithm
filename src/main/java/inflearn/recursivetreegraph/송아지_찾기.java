package inflearn.recursivetreegraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지_찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(BFS(s, e));
    }

    public static int BFS(int s, int e) {
        int answer = 0;
        int[] dis = {1, -1, 5};
        int[] ch = new int[10001];
        Queue<Integer> Q = new LinkedList<>();

        ch[s] = 1; // 출발 지점을 1로 초기화
        Q.offer(s);
        int L = 0; // 레벨 값 (점프 횟수)
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                if (x == e) {
                    return L;
                } else {
                    for (int j = 0; j < 3; j++) {
                        int nx = x + dis[j];
                        if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                            ch[nx] = 1;
                            Q.offer(nx);
                        }
                    }
                }
            }
            L++;
        }
        return answer;
    }

}
