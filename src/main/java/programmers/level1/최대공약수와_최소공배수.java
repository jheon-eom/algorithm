package programmers.level1;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) {
        solution(2, 5);
    }

    public static int[] solution(int n, int m) {
        int min = 0;
        int max = 0;

        // 최대공약수
        for (int i = 1; i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                min = i;
            }
        }
        // 최소공배수
        for (int i = m; i <= (n * m); i++) {
            if (i % n == 0 && i % m == 0) {
                max = i;
                break;
            }
        }
        return new int[] {min, max};
    }
}
