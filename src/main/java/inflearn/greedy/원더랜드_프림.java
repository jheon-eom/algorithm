package inflearn.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 원더랜드_프림 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        int[] ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
        int answer = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(1, 0));
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int ev = tmp.vex;
            if (ch[ev] == 0) {
                ch[ev] = 1;
                answer += tmp.cost;
                for (Edge e : graph.get(ev)) {
                    if (ch[e.vex] == 0) {
                        pQ.offer(new Edge(e.vex, e.cost));
                    }
                }
            }
        }
        System.out.println(answer);
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
