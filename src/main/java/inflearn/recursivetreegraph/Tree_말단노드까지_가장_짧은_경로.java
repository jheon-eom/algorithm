package inflearn.recursivetreegraph;

public class Tree_말단노드까지_가장_짧은_경로 {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(DFS(0, root));
    }

    public static int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }
    }

    private static class Node {

        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
        }

    }

}
