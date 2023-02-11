package inflearn.recursivetreegraph;

import java.util.*;

public class 그래프_최단거리_BFS {
    static int n;
    static int m;
    static List<List<Integer>> graph;
    static int[] ch;
    static int[] dis;

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        ch = new int[n + 1];
        dis = new int[n + 1];
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        BFS(1);
        for(int i = 2; i <= n; i++){
            System.out.println(i + " : " + dis[i]);
        }
    }
}
