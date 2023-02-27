package inflearn.dfsbfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 피자배달거리 {
    static int n;
    static int m;
    static int len;
    static int answer = Integer.MAX_VALUE;
    static int[] combi;
    static List<Point> hs;
    static List<Point> pz;

    public void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) +
                            Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        hs = new ArrayList<>();
        pz = new ArrayList<>();
        피자배달거리 T = new 피자배달거리();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    hs.add(new Point(i, j));
                } else if (tmp == 2) {
                    pz.add(new Point(i, j));
                }
            }
        }
        len = pz.size();
        combi = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }
}

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}