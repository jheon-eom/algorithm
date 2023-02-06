package inflearn.recursivetreegraph;

public class 이진트리순회 {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);
    }

    private static void DFS(Node root) {
        if (root == null) {
            return;
        } else {
//            System.out.print(root.data + " "); // 전위순회
            DFS(root.lt);
//            System.out.print(root.data + " "); // 중위순회
            DFS(root.rt);
//            System.out.print(root.data + " "); // 후위순회
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

