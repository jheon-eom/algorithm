package programmers.level1;

public class 콜라_문제 {
    public static void main(String[] args) {
        solution(3, 1, 20);
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (true) {
            int cokes = 0;
            int exchange = 0;
            exchange = (n / a) * b;
            answer += exchange;
            cokes = n % a;
            n = exchange + cokes;

            if (a > n) break;
        }

        System.out.println(answer);
        return answer;
    }
}
