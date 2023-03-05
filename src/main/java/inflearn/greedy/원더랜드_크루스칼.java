package inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 원더랜드_크루스칼 {
    static int[] unf;

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            unf[fa] = fb;
        }
    }

    private static int find(int v) {
        if (v == unf[v]) {
            return v;
        } else {
            return unf[v] = find(unf[v]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n + 1];
        List<Edge> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            arr.add(new Edge(v1, v2, cost));
        }
        int answer = 0;
        int count = 0;
        Collections.sort(arr);
        for (Edge e : arr) {
            int fv1 = find(e.v1);
            int fv2 = find(e.v2);
            if (fv1 != fv2) {
                answer += e.cost;
                count++;
                union(e.v1, e.v2); // 그룹화
            }
            if (count == (n - 1)) { // 트리 완성 시 종료
                break;
            }
        }
        System.out.println(answer);
    }

    static class Edge implements Comparable<Edge> {
        private int v1;
        private int v2;
        private int cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}
