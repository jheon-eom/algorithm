package programmers.level0;

public class 피자_나눠_먹기2 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        final int piece = 6; // 정해진 피자 조각
        int pizza = 0;

        for (int i = 1; i <= n; i++) {
            if (i * piece % n == 0) {
                pizza = i;
                break;
            }
        }
        return pizza;
    }
}
