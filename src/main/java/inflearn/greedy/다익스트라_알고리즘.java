package inflearn.greedy;

import java.util.*;

public class 다익스트라_알고리즘 {
    static int n;
    static int m;
    static List<List<Edge>> graph;
    static int dis[];

    public void solution(int v) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>(); // 제네릭 지워도 되는지 확인
        pQ.offer(new Edge(v, 0));
        dis[v] = 0;
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if (nowCost > dis[now]) {
                continue;
            }
            for (Edge e : graph.get(now)) {
                if (dis[e.vex] > nowCost + e.cost) {
                    dis[e.vex] = nowCost + e.cost;
                    pQ.offer(new Edge(e.vex, nowCost + e.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        다익스트라_알고리즘 T = new 다익스트라_알고리즘();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        T.solution(1);
        for (int i = 2; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + dis[i]);
            } else {
                System.out.println(i + " : impossible");
            }
        }
    }

    static class Edge implements Comparable<Edge> {
        private int vex;
        private int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}
