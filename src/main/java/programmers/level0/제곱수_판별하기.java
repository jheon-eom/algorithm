package programmers.level0;

public class 제곱수_판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(976));
    }
    public static int solution(int n) {
        for (int i = 1; i < n; i++) {
            if (i * i == n) {
                return 1;
            }
        }
        return 2;
    }
}
