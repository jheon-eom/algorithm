package inflearn.recursivetreegraph;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_말단노드까지_가장_짧은_경로_BFS {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
//        System.out.println(BFS(root));
    }

//    public static int BFS(Node root) {
//        Queue<Node> Q = new LinkedList<>();
//        Q.offer(root);
//        int L = 0;
//        while (!Q.isEmpty()) {
//            for (int i = 0; i < Q.size(); i++) {
//                Node cur = Q.poll();
//                if (cur.lt == null && cur.rt == null) {
//                    return L;
//                } else {
//                    if (cur.lt != null) {
//                        Q.offer(cur.lt);
//                    }
//                    if (cur.rt != null) {
//                        Q.offer(cur.rt);
//                    }
//                }
//            }
//            L++;
//        }
//        return 0;
//    }

    private static class Node {

        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
        }

    }

}
