package inflearn.recursivetreegraph;

public class 이진수_출력 {

    public static void main(String[] args) {
        DFS(11);
    }

    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n % 2 + " ");
            DFS(n / 2);
        }
    }

}
