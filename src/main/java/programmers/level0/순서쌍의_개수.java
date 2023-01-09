package programmers.level0;

import java.util.stream.IntStream;

public class 순서쌍의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution2(100));
    }

    public static int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int solution2(int n) {
        return (int) IntStream.rangeClosed(1, n).filter((i) -> n % i == 0).count();
    }
}
